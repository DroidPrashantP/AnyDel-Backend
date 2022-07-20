package com.quadvision.anydel.backend.ui.home

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.webkit.MimeTypeMap
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.google.firebase.messaging.FirebaseMessaging
import com.google.gson.Gson
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.CitiesData
import com.quadvision.anydel.backend.data.model.City
import com.quadvision.anydel.backend.data.model.ProfilePayload
import com.quadvision.anydel.backend.data.model.SessionManagmentModel
import com.quadvision.anydel.backend.data.model.SessionTimeOutModel
import com.quadvision.anydel.backend.data.model.User
import com.quadvision.anydel.backend.data.model.UserEvent
import com.quadvision.anydel.backend.data.model.UserInfo
import com.quadvision.anydel.backend.ui.ViewModelFactory
import com.quadvision.anydel.backend.ui.detail.DeliveryDetailFragment
import com.quadvision.anydel.backend.ui.login.DialogActionListener
import com.quadvision.anydel.backend.utils.ActivityNavigator
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.CommonUtility
import com.quadvision.anydel.backend.utils.DialogUtils
import com.quadvision.anydel.backend.utils.PermissionUtil
import com.quadvision.anydel.backend.utils.SecuredSharePreferenceUtil
import com.quadvision.anydel.backend.utils.appendZeroToMobileNumber
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import com.quadvision.anydel.backend.utils.showToast
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView
import de.greenrobot.event.EventBus
import timber.log.Timber
import java.io.File

class HomeActivity : AppCompatActivity(), HomeActivityListener,
    NavigationDrawerFragment.NavigationDrawerFragmentListener {

    private var mUnBinder: Unbinder? = null
    private lateinit var mContext: Context
    private lateinit var mNavigationDrawerFragment: NavigationDrawerFragment
    private lateinit var mUser: User

    private lateinit var homeViewModel: HomeViewModel

    @BindView(R.id.drawerLayout_Home)
    lateinit var mHomeDrawerLayout: DrawerLayout

    @BindView(R.id.toolbar)
    lateinit var mToolBar: Toolbar

    @BindView(R.id.tv_toolbarTitle)
    lateinit var mToolBarTitle: AppCompatTextView

    @BindView(R.id.iv_home_navDrawerIcon)
    lateinit var mNavigationDrawerIcon: AppCompatImageView


    private var mHomeFragment: HomeFragment? = null
    private var mUserInfo: UserInfo? = null
    private var mMobileNumber: String? = null
    private var mActionBar: ActionBar? = null
    private var fragmentManager: FragmentManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        mContext = this
        mUnBinder = ButterKnife.bind(this)
        setActionBar()
        bindView()
        bindViewModel()
        observeTheUserProfileData()
        loadFragment()
        loadUserData()
        fragmentManager = supportFragmentManager
    }

    private fun bindView() {
        mNavigationDrawerFragment = NavigationDrawerFragment.newInstance()
        initializeNavigationDrawerFragment()
        mHomeDrawerLayout.addDrawerListener(drawerListener)

        mNavigationDrawerIcon.setOnClickListener {
            mHomeDrawerLayout.openDrawer(Gravity.START)
        }
    }

    private fun bindViewModel() {
        homeViewModel = ViewModelProvider(this@HomeActivity, ViewModelFactory())
            .get(HomeViewModel::class.java)
    }

    private fun loadUserData() {
        mUserInfo = CommonUtility.getUserData()
        mMobileNumber = CommonUtility.getUserMobileData()
        if (mMobileNumber.isNullOrEmpty()) {
            mMobileNumber = mUserInfo?.mobileNo
        }
        SecuredSharePreferenceUtil.putStringData(
            SecuredSharePreferenceUtil.BUNDLE_MOBILE_NUMBER,
            mMobileNumber
        )
        mMobileNumber?.let {
            if (CommonUtility.isNetworkAvailable(mContext)) {
                homeViewModel.getUserProfile(
                    ProfilePayload(
                        it.appendZeroToMobileNumber(),
                        AnyDelConstant.USER_ROLE_SUPERVISOR
                    )
                )
                homeViewModel.getUserConfig()
            } else {
                mContext.showToast(getString(R.string.internet_connection_msg))
            }
        }
    }

    private fun loadFragment() {
        mHomeFragment = HomeFragment.newInstance()
        mHomeFragment?.let {
            changeFragment(it)
        }
    }

    private fun setActionBar() {
        setSupportActionBar(mToolBar)
        mActionBar = this.supportActionBar
        mActionBar?.let {
            it.setDisplayShowTitleEnabled(false)
            it.setDisplayHomeAsUpEnabled(false)
        }

        mToolBar.findViewById<AppCompatTextView>(R.id.tv_toolbarTitle).setOnClickListener {
            var citiesData = Gson().fromJson(
                SecuredSharePreferenceUtil.getStringData(
                    SecuredSharePreferenceUtil.CITIES_DATA,
                    ""
                ), CitiesData::class.java
            )
            citiesData?.let {
                DialogUtils.selectCityDialog(mContext, it.cities, object :
                    CityItemListAdapter.CityListAdapterListener {
                    override fun selectCity(city: City?) {
                        city?.let { cc ->
                            SecuredSharePreferenceUtil.putData(
                                SecuredSharePreferenceUtil.PREF_CURRENT_CITY,
                                cc.name
                            )
                            if (::mToolBarTitle.isInitialized) {
                                mToolBarTitle.text = cc.name
                            }
                        }
                    }

                })
            }

        }
    }

    private fun observeTheUserProfileData() {

        homeViewModel.userProfileResult.observe(this@HomeActivity, Observer {
            val getUserProfileResult = it ?: return@Observer
            if (getUserProfileResult.success != null) {
                mUser = getUserProfileResult.success as User

                var loginUserData = CommonUtility.getUserData()
                mUser.userInfo?.let { usrif ->
                    // We are doing this because profile data not returning the role
                    if(usrif.role.isNullOrEmpty()){
                        usrif.role = loginUserData?.role
                    }
                }

                SecuredSharePreferenceUtil.putUserData(
                    SecuredSharePreferenceUtil.USER_DATA,
                    Gson().toJson(mUser.userInfo)
                )
                SecuredSharePreferenceUtil.putData(
                    SecuredSharePreferenceUtil.BUNDLE_MOBILE_NUMBER,
                    mUser.userInfo?.mobileNo ?: ""
                )
                EventBus.getDefault().post(UserEvent(mUser.userInfo))
            }
        })

        homeViewModel.userConfig.observe(this@HomeActivity, Observer {
            val getUserConfigResult = it ?: return@Observer
            if (getUserConfigResult.success != null) {
                var citiesData = getUserConfigResult.success as CitiesData

                SecuredSharePreferenceUtil.putData(
                    SecuredSharePreferenceUtil.CITIES_DATA,
                    Gson().toJson(citiesData)
                )
                var isCityStoredInPref = SecuredSharePreferenceUtil.getStringData(
                    SecuredSharePreferenceUtil.PREF_CURRENT_CITY,
                    AnyDelConstant.EMPTY
                )
                if (!isCityStoredInPref.isNotNullOrEmpty()) {
                    DialogUtils.selectCityDialog(mContext, citiesData.cities, object :
                        CityItemListAdapter.CityListAdapterListener {
                        override fun selectCity(city: City?) {
                            city?.let { cc ->
                                SecuredSharePreferenceUtil.putData(
                                    SecuredSharePreferenceUtil.PREF_CURRENT_CITY,
                                    cc.name
                                )
                                if (::mToolBarTitle.isInitialized) {
                                    mToolBarTitle.text = cc.name
                                }
                            }
                        }

                    })
                } else {
                    if (::mToolBarTitle.isInitialized) {
                        mToolBarTitle.text = isCityStoredInPref
                    }
                }
            }
        })
    }

    private fun initializeNavigationDrawerFragment() {
        addFragment(R.id.fragment_home_navigation_drawer, mNavigationDrawerFragment)
    }

    private val drawerListener = object : DrawerLayout.DrawerListener {
        override fun onDrawerStateChanged(p0: Int) {
        }

        override fun onDrawerSlide(p0: View, p1: Float) {
        }

        override fun onDrawerOpened(p0: View) {
        }

        override fun onDrawerClosed(p0: View) {
            replaceFragment(R.id.fragment_home_navigation_drawer, mNavigationDrawerFragment)
        }
    }

    protected fun addFragment(containerViewId: Int, fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(containerViewId, fragment)
        fragmentTransaction.commitAllowingStateLoss()
    }


    private fun replaceFragment(containerViewId: Int, fragment: Fragment) {
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(containerViewId, fragment)
        fragmentTransaction.commitAllowingStateLoss()
    }


    override fun changeFragment(fragment: Fragment) {
        var backStateName = fragment::class.java.simpleName
        val fragmentManager = supportFragmentManager

        val fragmentPopped: Boolean = fragmentManager.popBackStackImmediate(backStateName, 0)
        if (!fragmentPopped) { //fragment not in back stack, create it.
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout_home_container, fragment)
            fragmentTransaction.addToBackStack(backStateName)
            fragmentTransaction.commit()
        }
    }

    override fun onBackPressedFragment() {
        onBackPressed()
    }

    override fun onBackPressed() {
        var fmManager = supportFragmentManager
        if(fmManager.backStackEntryCount == 1){
            finish()
        }
        super.onBackPressed()
    }

    override fun clearFragmentBackstack() {
        var fmManager = supportFragmentManager
        if (fmManager.backStackEntryCount > 0) {
            val first = fmManager.getBackStackEntryAt(0)
            fmManager.popBackStack(first.id, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }

    override fun closeSideDrawer() {
        mHomeDrawerLayout.closeDrawer(Gravity.START, true)
    }


    override fun logoutUser() {
        try {
            FirebaseMessaging.getInstance().deleteToken()
            SecuredSharePreferenceUtil.clearAllData()
            ActivityNavigator.navigateToLauncherActivity(mContext)
            finish()
        } catch (ex: Exception) {
            Timber.e("Exception in logoutUser : ${ex.localizedMessage}")
        }
    }

    override fun onStart() {
        super.onStart()
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mUnBinder?.unbind()
        EventBus.getDefault().unregister(this)
    }

    fun onEventMainThread(event: SessionManagmentModel) {
        event?.let {
            if (it.isLogout) {

                DialogUtils.showCustomDialog(
                    mContext, getString(R.string.session_expired_title),
                    getString(R.string.session_expired_default_message),
                    false, false, object : DialogActionListener {
                        override fun onOkayBtnClick() {
                            SecuredSharePreferenceUtil.clearAllData()
                            ActivityNavigator.navigateToLoginActivity(mContext)
                            finish()
                        }
                    }, false, false
                )

            }
        }
    }

    fun onEventMainThread(event: SessionTimeOutModel) {
        event?.let {
            if (it.error.isNotNullOrEmpty()) {
                DialogUtils.showCustomDialog(
                    mContext, getString(R.string.session_timeout_msg),
                    getString(R.string.something_went_wrong_msg),
                    false, false, object : DialogActionListener {
                        override fun onOkayBtnClick() {
//                          onBackPressed()
                        }
                    }, false, false
                )

            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // handle result of pick image chooser
        if (requestCode == CropImage.PICK_IMAGE_CHOOSER_REQUEST_CODE && resultCode == RESULT_OK) {
            val imageUri = CropImage.getPickImageResultUri(this, data)

            // For API >= 23 we need to check specifically that we have permissions to read external storage.
            if (CropImage.isReadExternalStoragePermissionsRequired(this, imageUri!!)) {
                // request permissions and handle the result in onRequestPermissionsResult()
                PermissionUtil.requestExternalStoragePermission(mContext as Activity)
            } else {
                // no permissions required or already grunted, can start crop image activity
                val contentResolver = mContext.contentResolver
                var type = contentResolver.getType(imageUri)
                if (type == null && imageUri != null && imageUri.path != null) {
                    val extension = MimeTypeMap.getFileExtensionFromUrl(
                        Uri.fromFile(File(imageUri.path)).toString()
                    )
                    type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension)
                }
                if (type != null && type.contains("image")) {
                    CropImage.activity(imageUri)
//                            .setAspectRatio(3, 4)
                        .setGuidelines(CropImageView.Guidelines.ON)
                        .setMultiTouchEnabled(true)
                        .start(this)
                }
            }
//            }
        }

        // handle result of CropImageActivity
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == RESULT_OK) {

                if (supportFragmentManager.fragments.last() is DeliveryDetailFragment) {
                    var deliveryDetailFragment: DeliveryDetailFragment? =
                        supportFragmentManager.fragments.last() as DeliveryDetailFragment
                    if (deliveryDetailFragment != null && deliveryDetailFragment.isVisible) {
                        deliveryDetailFragment.setCoverImagePath(result.uri)
                    }
                }
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Timber.e("Cropping failed: %s", result.error)
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            PermissionUtil.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION -> {
                try {
                    if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    }
                } catch (ex: Exception) {
                    ex.message?.let { Log.e("Exception#getLocation", it) }
                }
            }

            PermissionUtil.PERMISSIONS_REQUEST_CAMERA -> {
                try {
                    if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        Timber.e("Camera Permission granted")
                    }
                } catch (ex: Exception) {
                    ex.message?.let { Log.e("Exception#getLocation", it) }
                }
            }

            PermissionUtil.PERMISSIONS_REQUEST_EXTERNAL_STORAGE -> {
                try {
                    if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        Timber.e("External storage Permission granted")
                    }
                } catch (ex: Exception) {
                    ex.message?.let { Log.e("Exception#getLocation", it) }
                }
            }

            PermissionUtil.PERMISSIONS_REQUEST_PHONE_CALL -> {
                try {
                    if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        Timber.e("External storage Permission granted")
                        val intent = Intent(Intent.ACTION_CALL)
                        intent.data = Uri.parse("tel: +91 7499247664")
                        mContext.startActivity(intent)
                    }
                } catch (ex: Exception) {
                    ex.message?.let { Log.e("Exception#getLocation", it) }
                }
            }
        }
    }
}