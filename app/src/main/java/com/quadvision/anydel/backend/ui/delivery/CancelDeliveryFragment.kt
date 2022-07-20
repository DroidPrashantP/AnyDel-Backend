package com.quadvision.anydel.backend.ui.delivery

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
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.Unbinder
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.PackageDetail
import com.quadvision.anydel.backend.data.model.PackageDetailPayload
import com.quadvision.anydel.backend.data.model.PackageInfo
import com.quadvision.anydel.backend.data.model.PackageListDetailPayload
import com.quadvision.anydel.backend.data.model.UserInfo
import com.quadvision.anydel.backend.ui.ViewModelFactory
import com.quadvision.anydel.backend.ui.detail.PackageDetailFragment
import com.quadvision.anydel.backend.ui.home.HomeActivity
import com.quadvision.anydel.backend.ui.home.HomeActivityListener
import com.quadvision.anydel.backend.ui.home.HomeFragment
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.CommonUtility
import com.quadvision.anydel.backend.utils.DialogUtils
import com.quadvision.anydel.backend.utils.hide
import com.quadvision.anydel.backend.utils.isListNotEmpty
import com.quadvision.anydel.backend.utils.show
import com.quadvision.anydel.backend.utils.showToast


class CancelDeliveryFragment : Fragment() {

    companion object {
        fun newInstance() = CancelDeliveryFragment()
    }

    private lateinit var mContext: Context
    private var mButterKnifeUnBinder: Unbinder? = null
    private var mHomeActivityListener: HomeActivityListener? = null
    private var mDeliveryCompletedItemListAdapter: DeliveryCompletedItemListAdapter? = null
    private var mUserInfo: UserInfo? = null
    private var mDeliveryCompletedViewModel: DeliveryCompletedViewModel? = null


    @BindView(R.id.rv_cancelledDeliveryScreen)
    lateinit var mDeliveryCompletedListRV: RecyclerView

    @BindView(R.id.cl_progressBarContainer)
    lateinit var mProgressBarContainer: ConstraintLayout

    @BindView(R.id.cl_empty_container)
    lateinit var mEmptyContainer: ConstraintLayout

    @BindView(R.id.tv_empty_message)
    lateinit var mEmptyMessageTV: AppCompatTextView


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

        val fragmentView = inflater.inflate(R.layout.fragment_cancel_delivery, container, false)
        mButterKnifeUnBinder = ButterKnife.bind(this, fragmentView)
        return fragmentView

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViewModel()
        loadUserData()
        setUpUI()
        loadDeliveryCompletedData()
    }
    private fun bindViewModel() {
        mDeliveryCompletedViewModel = ViewModelProvider(
            mContext as HomeActivity,
            ViewModelFactory()
        )[DeliveryCompletedViewModel::class.java]
    }

    private fun setUpUI() {
        setUpTheAddressListAdapter()
        observerData()
    }

    private fun observerData() {
        mDeliveryCompletedViewModel?.deliveryCompletedResult?.observe(viewLifecycleOwner, Observer {
            if (viewLifecycleOwner.lifecycle.currentState == Lifecycle.State.RESUMED) {
                showListView()
                val pckDetailResult = it ?: return@Observer
                if (pckDetailResult.success != null) {
                    DialogUtils.hideProgressDialog()
                    val packageSubmit = pckDetailResult.success as PackageDetail
                    if (packageSubmit.packageData.isListNotEmpty() && !packageSubmit.statusMessage.equals(
                            "Package is not found",
                            true
                        )
                    ) {
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
            val completedDeliveryList = mutableListOf<PackageInfo>()
            for (packageInfo in packageData) {
                if (AnyDelConstant.CANCELLED.equals(packageInfo.packStatus, true)) {
                    completedDeliveryList.add(packageInfo)
                }
            }
            if (completedDeliveryList.isListNotEmpty()) {
                mDeliveryCompletedItemListAdapter?.updatePackageInfoList(completedDeliveryList)
            } else {
                showHideEmptyView(true)
            }
        }
    }

    private fun showListView() {
        mProgressBarContainer.hide()
        mEmptyContainer.hide()
        mDeliveryCompletedListRV.show()
    }

    private fun loadDeliveryCompletedData() {
        if (CommonUtility.isNetworkAvailable(mContext)) {
            showProgress(true)
            mDeliveryCompletedViewModel?.getDeliveryCompletedList(
                PackageListDetailPayload(
                    CommonUtility.getUserData()?.mobileNo.toString(), AnyDelConstant.CANCELLED
                )
            )
        } else {
            mContext.showToast(getString(R.string.internet_connection_msg))
        }
    }

    private fun showHideEmptyView(isVisible: Boolean) {
        if (isVisible) {
            mEmptyContainer.show()
            mEmptyMessageTV.text = "No data found!"
            mDeliveryCompletedListRV.hide()
        } else {
            mEmptyContainer.hide()
            mDeliveryCompletedListRV.show()
        }
    }

    private fun showProgress(isVisible: Boolean) {
        if (isVisible) {
            mProgressBarContainer.show()
            mEmptyContainer.hide()
            mDeliveryCompletedListRV.hide()
        }
    }

    private fun setUpTheAddressListAdapter() {
        mDeliveryCompletedListRV?.apply {
            layoutManager = LinearLayoutManager(mContext)
            mDeliveryCompletedItemListAdapter =
                DeliveryCompletedItemListAdapter(mContext, mDeliveryCompletedListItemListener)
            (this.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
            adapter = mDeliveryCompletedItemListAdapter
        }
    }

    private var mDeliveryCompletedListItemListener =
        object : DeliveryCompletedItemListAdapter.DeliveryCompletedListItemListener {
            override fun setSelectedPackage(packageInfo: PackageInfo?) {
                packageInfo?.let {
                    mHomeActivityListener?.changeFragment(
                        PackageDetailFragment.newInstance(
                            it.packId,
                            false
                        )
                    )
                }
            }
        }

    override fun onStart() {
        super.onStart()
    }

    private fun loadUserData() {
        mUserInfo = CommonUtility.getUserData()
    }

    @OnClick(R.id.btn_cancelledDeliveryScreen_home)
    fun clickOnHomeBtn() {
        mHomeActivityListener?.changeFragment(HomeFragment.newInstance())
    }

    override fun onDestroy() {
        super.onDestroy()
        mButterKnifeUnBinder?.unbind()
    }

}