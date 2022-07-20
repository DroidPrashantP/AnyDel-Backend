package com.quadvision.anydel.backend.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.Unbinder
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.UpdateProfileEvent
import com.quadvision.anydel.backend.data.model.UserInfo
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.CommonUtility
import com.quadvision.anydel.backend.utils.ImageUtil
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import de.greenrobot.event.EventBus

class NavigationDrawerFragment : Fragment() {

    companion object {
        fun newInstance() = NavigationDrawerFragment()
    }

    interface NavigationDrawerFragmentListener {
        fun closeSideDrawer()
        fun logoutUser()
    }

    @BindView(R.id.iv_navigationDrawer_userImage)
    lateinit var mUserImageView: AppCompatImageView

    @BindView(R.id.tv_navigationDrawer_username)
    lateinit var mUserNameTV: AppCompatTextView

    @BindView(R.id.tv_navigationDrawer_mobile)
    lateinit var mUserMobileTV: AppCompatTextView

    private lateinit var mContext: Context
    private var mButterKnifeUnBinder: Unbinder? = null
    private var mNavigationDrawerFragmentListener: NavigationDrawerFragmentListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = activity as Context

        if (mContext is NavigationDrawerFragmentListener) {
            mNavigationDrawerFragmentListener = mContext as NavigationDrawerFragmentListener
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentView = inflater.inflate(R.layout.fragment_navigation_drawer, container, false)
        mButterKnifeUnBinder = ButterKnife.bind(this, fragmentView)
        return fragmentView

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUI(CommonUtility.getUserData())
    }

    private fun setUpUI(userInfo: UserInfo?) {
        userInfo?.let { userInfo ->
            mUserNameTV.text = if (userInfo.name.isNotNullOrEmpty()) userInfo.name else userInfo.firstName.plus(" ")
                .plus(userInfo.lastName)
            mUserMobileTV.text = userInfo.mobileNo

            if (userInfo.profileImage.isNotNullOrEmpty()) {
                ImageUtil.loadImage(mContext, userInfo.profileImage, mUserImageView, true)
            }

            mUserImageView?.setOnClickListener {
                if (userInfo.profileImage.isNotNullOrEmpty()) {
//                    ActivityNavigator.navigateToImageFullScreen(mContext, userInfo.profileImage!!)
                }
            }
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
        mButterKnifeUnBinder?.unbind()
        EventBus.getDefault().unregister(this)
    }

    @OnClick(R.id.tv_navigationDrawer_logout)
    fun onLogoutClick() {
        mNavigationDrawerFragmentListener?.logoutUser()
    }

    @OnClick(R.id.tv_navigationDrawer_aboutUs)
    fun onAboutUsClick() {
        CommonUtility.openExternalBrowser(mContext, AnyDelConstant.ABOUT_US_LINK)
    }

    @OnClick(R.id.tv_navigationDrawer_notification)
    fun onNotificationClick() {
//        ActivityNavigator.navigateToNotificationActivity(mContext)
    }

    fun onEventMainThread(updateProfileEvent: UpdateProfileEvent) {
        updateProfileEvent?.let {
            if (it.userInfo != null) {
                setUpUI(it.userInfo)
            }
        }
    }
}