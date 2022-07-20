package com.quadvision.anydel.backend.ui.detail

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.*
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.*
import com.quadvision.anydel.backend.ui.ViewModelFactory
import com.quadvision.anydel.backend.ui.home.HomeActivity
import com.quadvision.anydel.backend.ui.home.HomeActivityListener
import com.quadvision.anydel.backend.ui.home.HomeFragment
import com.quadvision.anydel.backend.ui.home.PackageDetailViewModel
import com.quadvision.anydel.backend.utils.*


class TrackPackageDetailFragment : Fragment() {

    companion object {

        @JvmStatic
        fun newInstance(packageId: String?) = TrackPackageDetailFragment().apply {
            mPackageId = packageId
        }
    }

    @BindView(R.id.tv_trackPackageDetailScreen_packageIdValue)
    lateinit var mPackageIdTV: AppCompatTextView

    @BindView(R.id.tv_trackPackageDetailScreen_headerDesc)
    lateinit var mPackageDescMsgTV: AppCompatTextView

    @BindView(R.id.rv_trackPackageDetail)
    lateinit var mTrackStateRV: RecyclerView

    @BindView(R.id.btn_trackPackageDetailScreen_deliveryDetailBtn)
    lateinit var mDeliveryDetailBtn: AppCompatButton

    @BindView(R.id.btn_trackPackageDetailScreen_cancelDeliveryBtn)
    lateinit var mCancelDeliveryBtn: AppCompatButton

    @BindView(R.id.cl_progressBarContainer)
    lateinit var mProgressLayout: ConstraintLayout

    @BindString(R.string.Rs)
    lateinit var mRsSymbol: String

    private lateinit var mContext: Context
    private var mButterKnifeUnBinder: Unbinder? = null
    private var mHomeActivityListener: HomeActivityListener? = null
    private var mPackageDetailViewModel: PackageDetailViewModel? = null
    private var mTrackStepList: MutableList<TrackStepItem>? = null
    private var mPackageId: String? = null
    private var mTrackStepperItemListAdapter: TrackStepperItemListAdapter? = null


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
        // Inflate the layout for this fragment
        val fragmentView =
            inflater.inflate(R.layout.fragment_track_package_detail, container, false)
        mButterKnifeUnBinder = ButterKnife.bind(this, fragmentView)
        return fragmentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewModel()
        observerData()
        setUpView()
        loadData()
    }

    private fun loadData() {
        if (CommonUtility.isNetworkAvailable(mContext)) {
            val mobileNumber = SecuredSharePreferenceUtil.getStringData(
                SecuredSharePreferenceUtil.BUNDLE_MOBILE_NUMBER,
                AnyDelConstant.EMPTY
            )
            if (mobileNumber.isNotNullOrEmpty() && mPackageId.isNotNullOrEmpty()) {
                mProgressLayout.show()
                mPackageDetailViewModel?.trackPackageDetail(
                    PackageDetailPayload(
                        mobileNumber!!,
                        mPackageId!!
                    )
                )
            }
        } else {
            mContext.showToast(getString(R.string.internet_connection_msg))
        }
    }

    private fun setUpViewModel() {
        mPackageDetailViewModel = ViewModelProvider(mContext as HomeActivity, ViewModelFactory())
            .get(PackageDetailViewModel::class.java)
    }

    private fun setUpView() {
        mTrackStepList = AnyDelConstant.getTrackingStepList()

        mTrackStateRV.apply {
            layoutManager = LinearLayoutManager(mContext)
            mTrackStepperItemListAdapter = TrackStepperItemListAdapter(mContext)
            adapter = mTrackStepperItemListAdapter
        }
    }

    private fun observerData() {

        mPackageDetailViewModel?.trackPackageDetailResult?.observe(viewLifecycleOwner, Observer {
            if (viewLifecycleOwner.lifecycle.currentState == Lifecycle.State.RESUMED) {
                val pckDetailResult = it ?: return@Observer
                mProgressLayout.hide()
                if (pckDetailResult.success != null) {
                    val apiResponse = pckDetailResult.success as TrackPackage
                    updateUI(apiResponse.packageData[0])
                    mPackageDescMsgTV.text = apiResponse.packageData[0].packDescription

                } else {
                    mContext.showToast("Package tracking failed!")
                }
            }
        })
    }

    private fun updateUI(packageSubmit: PackageInfo?) {
        packageSubmit?.let {
            mPackageIdTV.text = it.packId

            when {
                it.packStatus.equals(AnyDelConstant.REJECTED, true) -> {
                    mTrackStepList?.add(TrackStepItem(mTrackStepList?.size!! - 1 , AnyDelConstant.REJECTED, false))
                }
                it.packStatus.equals(AnyDelConstant.CANCELLED, true) -> {
                    mTrackStepList?.add(TrackStepItem(mTrackStepList?.size!! - 1, AnyDelConstant.CANCELLED, false))
                }
                else -> {
                    mTrackStepList?.add(TrackStepItem(mTrackStepList?.size!! - 1, AnyDelConstant.COMPLETED, false))
                }
            }
         mTrackStepperItemListAdapter?.updateTrackerStepList(getTheSelectedList(it))
        }
    }

    private fun getTheSelectedList(packageInfo: PackageInfo): MutableList<TrackStepItem>? {
        packageInfo?.let {
            var count = -1
            for (trac in mTrackStepList!!) {
                count++
                if (AnyDelConstant.PENDING_STATUS_LIST.contains(packageInfo.packStatus)) {
                    count = 0
                    break
                } else if (AnyDelConstant.PAYMENT_STATUS_LIST.contains(packageInfo.packStatus)) {
                    count = 5
                    break
                } else if (packageInfo.packStatus.contains(trac.stepName)) {
                    break
                }
            }
            if (count > -1) {
                mTrackStepList?.get(count)?.isSelected = true
            }
        }
        return mTrackStepList
    }

    @OnClick(R.id.btn_trackPackageDetailScreen_deliveryDetailBtn)
    fun deliveryDetailBtnClick() {
        mHomeActivityListener?.onBackPressedFragment()
    }

    @OnClick(R.id.btn_trackPackageDetailScreen_cancelDeliveryBtn)
    fun cancelDeliveryBtnClick() {
        // Not available for now
    }

    @OnClick(R.id.btn_trackPackageDetailScreen_homeBtn)
    fun homeBtnClick() {
        mHomeActivityListener?.clearFragmentBackstack()
        mHomeActivityListener?.changeFragment(HomeFragment.newInstance())
    }
}