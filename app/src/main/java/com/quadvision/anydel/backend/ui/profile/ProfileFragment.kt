package com.quadvision.anydel.backend.ui.profile

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.Unbinder
import com.google.gson.Gson
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.UpdateProfileEvent
import com.quadvision.anydel.backend.data.model.User
import com.quadvision.anydel.backend.data.model.UserInfo
import com.quadvision.anydel.backend.ui.ViewModelFactory
import com.quadvision.anydel.backend.ui.home.HomeActivity
import com.quadvision.anydel.backend.ui.home.HomeActivityListener
import com.quadvision.anydel.backend.ui.home.HomeFragment
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.CommonUtility
import com.quadvision.anydel.backend.utils.DialogUtils
import com.quadvision.anydel.backend.utils.ImageUtil
import com.quadvision.anydel.backend.utils.SecuredSharePreferenceUtil
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import com.quadvision.anydel.backend.utils.showToast
import de.greenrobot.event.EventBus


class ProfileFragment : Fragment() {

    companion object {
        fun newInstance() = ProfileFragment()
    }

    private lateinit var mContext: Context
    private var mButterKnifeUnBinder: Unbinder? = null

    @BindView(R.id.iv_profileV5Header_userImage)
    lateinit var mUserImageView: AppCompatImageView

    @BindView(R.id.tv_profileScreen_nameField)
    lateinit var mTvNameField: AppCompatTextView

    @BindView(R.id.tv_profileScreen_surField)
    lateinit var mTvSurnameField: AppCompatTextView

    @BindView(R.id.tv_profileScreen_mobileField)
    lateinit var mTvMobileField: AppCompatTextView

    @BindView(R.id.tv_profileScreen_emailField)
    lateinit var mTvEmailField: AppCompatTextView


    private var mUserInfo: UserInfo? = null
    private var mHomeActivityListener: HomeActivityListener? = null
    private var mProfileViewModel: ProfileViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = activity as Context
        if (mContext is HomeActivityListener) {
            mHomeActivityListener = mContext as HomeActivityListener
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentView = inflater.inflate(R.layout.fragment_profile, container, false)
        mButterKnifeUnBinder = ButterKnife.bind(this, fragmentView)
        return fragmentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mUserInfo = CommonUtility.getUserData()
        bindViewModel()
        bindData()
    }


    private fun bindViewModel() {
        mProfileViewModel = ViewModelProvider(mContext as HomeActivity, ViewModelFactory())
            .get(ProfileViewModel::class.java)
        observeTheUserProfileData()
    }

    private fun bindData() {
        mUserInfo?.let {
            mTvNameField.text = it.firstName
            mTvSurnameField.text = it.lastName
            mTvMobileField.text = it.mobileNo
            mTvEmailField.text = it.emailId

            if (it.profileImage.isNotNullOrEmpty()) {
                ImageUtil.loadImage(mContext, it.profileImage, mUserImageView, true)
            }
        }
    }

    private fun observeTheUserProfileData() {

        mProfileViewModel?.editProfileResult?.removeObservers(this)
        mProfileViewModel?.editProfileResult?.observe(viewLifecycleOwner, Observer {
            if (viewLifecycleOwner.lifecycle.currentState == Lifecycle.State.RESUMED) {
                DialogUtils.hideProgressDialog()
                val getEditProfileResult = it ?: return@Observer
                if (getEditProfileResult.success != null) {
                    var userInfo = (getEditProfileResult.success as User).userInfo
                    var newMobileNo = userInfo?.mobileNo

                    var localData = Gson().fromJson(SecuredSharePreferenceUtil.getStringData(SecuredSharePreferenceUtil.USER_DATA, AnyDelConstant.EMPTY), UserInfo::class.java)
                    if(localData !=null){
                        localData.mobileNo = newMobileNo
                        EventBus.getDefault().post(UpdateProfileEvent(localData))
                    }
                } else {
                    getEditProfileResult.error?.let { it1 -> mContext.showToast(it1) }
                }
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        mButterKnifeUnBinder?.unbind()
    }


    @OnClick(R.id.btn_profileScreen_home)
    fun clickOnHomeView() {
        mHomeActivityListener?.changeFragment(HomeFragment.newInstance())
    }

    @OnClick(R.id.iv_profileV5Header_userImage)
    fun clickOnImageView() {
        mUserInfo?.let {
            if (it.profileImage.isNotNullOrEmpty()) {
//                ActivityNavigator.navigateToImageFullScreen(mContext, it.profileImage!!)
            }
        }
    }
}