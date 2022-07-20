package com.quadvision.anydel.backend.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SimpleItemAnimator
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import butterknife.BindString
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.Unbinder
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.PackageDetail
import com.quadvision.anydel.backend.data.model.PackageDetailPayload
import com.quadvision.anydel.backend.data.model.PackageInfo
import com.quadvision.anydel.backend.data.model.PackageListDetailPayload
import com.quadvision.anydel.backend.data.model.UserEvent
import com.quadvision.anydel.backend.data.model.UserInfo
import com.quadvision.anydel.backend.ui.ViewModelFactory
import com.quadvision.anydel.backend.ui.delivery.CancelDeliveryFragment
import com.quadvision.anydel.backend.ui.delivery.CompletedDeliveryFragment
import com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedItemListAdapter
import com.quadvision.anydel.backend.ui.delivery.PendingDeliveryItemListAdapter
import com.quadvision.anydel.backend.ui.detail.DeliveryDetailFragment
import com.quadvision.anydel.backend.ui.detail.PackageDetailFragment
import com.quadvision.anydel.backend.ui.profile.ProfileFragment
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.CommonUtility
import com.quadvision.anydel.backend.utils.DialogUtils
import com.quadvision.anydel.backend.utils.hide
import com.quadvision.anydel.backend.utils.isListNotEmpty
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import com.quadvision.anydel.backend.utils.show
import com.quadvision.anydel.backend.utils.showToast

import de.greenrobot.event.EventBus


class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var mContext: Context
    private var mButterKnifeUnBinder: Unbinder? = null
    private var mHomeActivityListener: HomeActivityListener? = null
    private var mUserInfo: UserInfo? = null
    private var mPendingDeliveryItemListAdapter: PendingDeliveryItemListAdapter? = null
    private var mHomeViewModel: HomeViewModel? = null

    @BindView(R.id.swipeRefreshLayout_deliveriesToComplete)
    lateinit var mSwipeRefreshLayout : SwipeRefreshLayout

    @BindView(R.id.tv_homeScreen_welcomeMsg)
    lateinit var mWelcomeMsgTV : AppCompatTextView

    @BindView(R.id.rv_homeScreen_deliveriesToComplete)
    lateinit var mPendingDeliveryRV : RecyclerView

    @BindView(R.id.cl_progressBarContainer)
    lateinit var mProgressBarContainer: ConstraintLayout

    @BindView(R.id.cl_empty_container)
    lateinit var mEmptyContainer: ConstraintLayout

    @BindView(R.id.tv_empty_message)
    lateinit var mEmptyMessageTV: AppCompatTextView

    @BindString(R.string.welcome_msg)
    lateinit var mWelcomeMsg : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = activity as Context
        if(mContext is HomeActivityListener){
            mHomeActivityListener = mContext as HomeActivityListener
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentView = inflater.inflate(R.layout.fragment_home, container, false)
        mButterKnifeUnBinder = ButterKnife.bind(this, fragmentView)
        return fragmentView

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViewModel()
        loadUserData()
        setUpUI()
    }

    private fun setUpUI() {
        mUserInfo?.let {
            mWelcomeMsgTV.text = String.format(mWelcomeMsg, if(it.name.isNotNullOrEmpty()) it.name else it.firstName, CommonUtility.getGoodMorningMsg())
        }
        setUpPullToRefresh()
        setUpTheAddressListAdapter()
        observerData()
        loadPendingDeliveryData()
    }

    private fun setUpPullToRefresh() {
        mSwipeRefreshLayout?.setOnRefreshListener {
            mProgressBarContainer.show()
            loadPendingDeliveryData()
        }
    }


    private fun setUpTheAddressListAdapter() {
        mPendingDeliveryRV?.apply {
            layoutManager = LinearLayoutManager(mContext)
            mPendingDeliveryItemListAdapter = PendingDeliveryItemListAdapter(mContext, mPendingDeliveryListItemListener)
            (this.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
            adapter = mPendingDeliveryItemListAdapter
        }
    }

    private fun observerData() {
        mHomeViewModel?.pendingDeliveryResult?.observe(viewLifecycleOwner, Observer {
            if (viewLifecycleOwner.lifecycle.currentState == Lifecycle.State.RESUMED) {
                mSwipeRefreshLayout.isRefreshing = false
                showListView()
                val pckDetailResult = it ?: return@Observer
                if (pckDetailResult.success != null) {
                    DialogUtils.hideProgressDialog()
                    val packageSubmit = pckDetailResult.success as PackageDetail
                    if (packageSubmit.packageData.isListNotEmpty() && !packageSubmit.statusMessage.equals("Package is not found" , true)) {
                        updateUI(packageSubmit.packageData as MutableList<PackageInfo>)
                    } else {
                        showHideEmptyView(true)
                    }
                } else {
                    DialogUtils.hideProgressDialog()
                    showHideEmptyView(true)
                    mContext.showToast("Package detail failed!")
                }
            }
        })
    }

    private fun updateUI(packageData: MutableList<PackageInfo>) {
        if (packageData.isListNotEmpty()) {
            val deliveryList = mutableListOf<PackageInfo>()
            for (packageInfo in packageData) {
                // Delivery status should not be completed or cancelled
                if (!(AnyDelConstant.COMPLETED.equals(packageInfo.packStatus, true) || AnyDelConstant.CANCELLED.equals(packageInfo.packStatus, true))) {
                    deliveryList.add(packageInfo)
                }
            }
            if (deliveryList.isListNotEmpty()) {
                mPendingDeliveryItemListAdapter?.updatePackageInfoList(deliveryList)
            } else {
                showHideEmptyView(true)
            }
        }
    }

    private fun showListView() {
        mProgressBarContainer.hide()
        mEmptyContainer.hide()
        mPendingDeliveryRV.show()
    }

    private fun showHideEmptyView(isVisible: Boolean) {
        if (isVisible) {
            mEmptyContainer.show()
            mEmptyMessageTV.text = "No data found!"
            mPendingDeliveryRV.hide()
        } else {
            mEmptyContainer.hide()
            mPendingDeliveryRV.show()
        }
    }

    private fun bindViewModel() {
        mHomeViewModel = ViewModelProvider(
            mContext as HomeActivity,
            ViewModelFactory()
        )[HomeViewModel::class.java]
    }


    private fun loadPendingDeliveryData() {
        if (CommonUtility.isNetworkAvailable(mContext)) {
            showProgress(true)
            mHomeViewModel?.getPendingDeliveryList(
                PackageListDetailPayload(
                    CommonUtility.getUserData()?.mobileNo.toString(), AnyDelConstant.PENDING
                )
            )
        } else {
            mContext.showToast(getString(R.string.internet_connection_msg))
        }
    }

    private fun showProgress(isVisible: Boolean) {
        if (isVisible) {
            mProgressBarContainer.show()
            mEmptyContainer.hide()
            mPendingDeliveryRV.hide()
        }
    }

    private var mPendingDeliveryListItemListener =
        object : PendingDeliveryItemListAdapter.PendingDeliveryListItemListener {
            override fun setSelectedPackage(packageInfo: PackageInfo?) {
                packageInfo?.let {
                    mHomeActivityListener?.changeFragment(
                        DeliveryDetailFragment.newInstance(
                            it,
                            false
                        )
                    )
                }
            }
        }


    override fun onStart() {
        super.onStart()
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this)
        }
    }

    private fun loadUserData() {
        mUserInfo = CommonUtility.getUserData()
    }

    @OnClick(R.id.cl_homeScreen_deliveryCompletedContainer)
    fun clickOnDeliveryHistory() {
        mHomeActivityListener?.changeFragment(CompletedDeliveryFragment.newInstance())
    }

    @OnClick(R.id.cl_homeScreen_cancelDeliveryContainer)
    fun clickOnServiceHistory() {
        mHomeActivityListener?.changeFragment(CancelDeliveryFragment.newInstance())
    }

    @OnClick(R.id.cl_homeScreen_myAddressContainer)
    fun clickOnAddressContainer() {
//        mHomeActivityListener?.changeFragment(AddressListFragment.newInstance())
    }

    @OnClick(R.id.cl_homeScreen_myProfileContainer)
    fun clickOnProfileHistory() {
        mHomeActivityListener?.changeFragment(ProfileFragment.newInstance())
    }

    @OnClick(R.id.cl_homeScreen_settingContainer)
    fun clickOnSettingContainer() {

    }

    override fun onDestroy() {
        super.onDestroy()
        mButterKnifeUnBinder?.unbind()
        EventBus.getDefault().unregister(this)
    }

    fun onEventMainThread(event: UserEvent) {
        event?.user.let {
            mUserInfo = it
            setUpUI()
        }
    }

}