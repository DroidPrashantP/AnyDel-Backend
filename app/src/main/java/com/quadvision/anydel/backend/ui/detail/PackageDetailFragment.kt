package com.quadvision.anydel.backend.ui.detail

import PicList
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import butterknife.*
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.*
import com.quadvision.anydel.backend.ui.ViewModelFactory
import com.quadvision.anydel.backend.ui.home.HomeActivity
import com.quadvision.anydel.backend.ui.home.HomeActivityListener
import com.quadvision.anydel.backend.ui.home.HomeFragment
import com.quadvision.anydel.backend.ui.home.PackageDetailViewModel
import com.quadvision.anydel.backend.utils.*
import timber.log.Timber
import java.lang.Exception


class PackageDetailFragment : Fragment() {


    companion object {
        const val PACKAGE_TRACKING = "pck_tracking"
        const val PACKAGE_DETAIL = "pck_detail"

        @JvmStatic
        fun newInstance(packageId: String?, isDeliveryFlow: Boolean) =
            PackageDetailFragment().apply {
                mPackageId = packageId
                mIsDeliveryFlow = isDeliveryFlow
            }
    }

    @BindView(R.id.tv_packageDetailScreen_packageIdValue)
    lateinit var mPackageIdTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_deliveryDateValue)
    lateinit var mDeliveryDateValueTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_deliveryTimeValue)
    lateinit var mDeliveryTimeValueTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_pickUpAddressLabel)
    lateinit var mPickUpAddressLabelTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_pickUpAddressValue)
    lateinit var mPickUpAddressValueTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_dropOffAddressLabel)
    lateinit var mDropUpAddressLabelTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_dropOffAddressValue)
    lateinit var mDropUpAddressValueTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_bookingDateValue)
    lateinit var mBookingDateValueTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_bookingTimeValue)
    lateinit var mBookingTimeValueTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_statusLabel)
    lateinit var mDeliveryStatusLabelTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_statusValue)
    lateinit var mDeliveryStatusValueTV: AppCompatTextView

    @BindView(R.id.tv_packageDetailScreen_amountValue)
    lateinit var mDeliveryAmountValueTV: AppCompatTextView

    @BindView(R.id.ll_packageDetailScreen_imagesContainer)
    lateinit var mPackageAttachedImagesContainer: LinearLayoutCompat

    @BindString(R.string.Rs)
    lateinit var mRsSymbol: String

    private lateinit var mContext: Context
    private var mButterKnifeUnBinder: Unbinder? = null
    private var mHomeActivityListener: HomeActivityListener? = null
    private var mPackageDetailViewModel: PackageDetailViewModel? = null
    private var mAttachedImagesList: ArrayList<PicList>? = null
    private var mPackageId: String? = null
    var mIsDeliveryFlow: Boolean = false

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
        val fragmentView = inflater.inflate(R.layout.fragment_package_detail, container, false)
        mButterKnifeUnBinder = ButterKnife.bind(this, fragmentView)
        return fragmentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DialogUtils.showProgressDialog(mContext, "Fetching the Delivery Data")
        clearBackStackFragment()
        setUpViewModel()
        observerData()
        setUpView()
        loadData()
    }

    private fun clearBackStackFragment() {
        try {
//            val fm = (mContext as HomeActivity).supportFragmentManager
//            fm.popBackStackImmediate(SlotAndTimeSelectionFragment::class.java.simpleName, 0)
//            fm.popBackStackImmediate(PackageInfoFragment::class.java.simpleName, 0)
//            fm.popBackStackImmediate(AddressPickerFragment::class.java.simpleName, 0)

        } catch (ex: Exception) {
            Timber.e("Exception caught in clearBackStackFragment : ${ex.message}")
        }
    }

    private fun loadData() {
        val mobileNumber = SecuredSharePreferenceUtil.getStringData(
            SecuredSharePreferenceUtil.BUNDLE_MOBILE_NUMBER,
            AnyDelConstant.EMPTY
        )
        if (mobileNumber.isNotNullOrEmpty() && mPackageId.isNotNullOrEmpty()) {
            mPackageDetailViewModel?.getPackageDetail(
                PackageDetailPayload(
                    mobileNumber!!,
                    mPackageId!!
                )
            )
        }
    }

    private fun setUpViewModel() {
        mPackageDetailViewModel = ViewModelProvider(mContext as HomeActivity, ViewModelFactory())
            .get(PackageDetailViewModel::class.java)
    }

    private fun setUpView() {
        mAttachedImagesList = ArrayList()

    }

    private fun observerData() {
        mPackageDetailViewModel?.packageDetailResult?.observe(viewLifecycleOwner, Observer {
            if (viewLifecycleOwner.lifecycle.currentState == Lifecycle.State.RESUMED) {
                val pckDetailResult = it ?: return@Observer
                if (pckDetailResult.success != null) {
                    DialogUtils.hideProgressDialog()
                    val packageSubmit = pckDetailResult.success as PackageDetail
                    if (packageSubmit.packageData.isListNotEmpty()) {
                        updateUI(packageSubmit.packageData?.get(0), PACKAGE_DETAIL)
                    }
                } else {
                    DialogUtils.hideProgressDialog()
                    mContext.showToast("Package detail failed!")
                }
            }
        })

        mPackageDetailViewModel?.trackPackageDetailResult?.observe(viewLifecycleOwner, Observer {
            if (viewLifecycleOwner.lifecycle.currentState == Lifecycle.State.RESUMED) {
                val pckDetailResult = it ?: return@Observer
                if (pckDetailResult.success != null) {
                    val apiResponse = pckDetailResult.success as TrackPackage
                    updateUI(apiResponse.packageData[0], PACKAGE_TRACKING)

                } else {
                    mContext.showToast("Package tracking failed!")
                }
            }
        })

        mPackageDetailViewModel?.submitRatingResult?.observe(viewLifecycleOwner, Observer {
            if (viewLifecycleOwner.lifecycle.currentState == Lifecycle.State.RESUMED) {
                val submitRatingResult = it ?: return@Observer
                if (submitRatingResult.success != null) {
                    val apiResponse = submitRatingResult.success as ApiResponse
                    apiResponse.statusMessage?.let { it1 -> mContext.showToast(it1) }

                } else {
                    mContext.showToast("Submit rating failed!")
                }
            }
        })
    }

    private fun updateUI(packageSubmit: PackageInfo?, apiType: String) {

        packageSubmit?.let {
            mPackageIdTV.text = it.packId
            mBookingDateValueTV.text = it.BookDate
            mBookingTimeValueTV.text = CommonUtility.getFormattedTime(it.BookTime)
            mDeliveryDateValueTV.text = it.DeliveryDate
            mDeliveryTimeValueTV.text = CommonUtility.getFormattedTime(it.DeliveryTime)
            if (it.pickAddr.isListNotEmpty()) {
                mPickUpAddressValueTV.show()
                mPickUpAddressLabelTV.show()
                mPickUpAddressValueTV.text = CommonUtility.getCompleteAddress(it.pickAddr[0])
            } else {
                mPickUpAddressValueTV.hide()
                mPickUpAddressLabelTV.hide()
            }
            if (it.dropAddr.isListNotEmpty()) {
                mDropUpAddressValueTV.show()
                mDropUpAddressLabelTV.show()
                mDropUpAddressValueTV.text = CommonUtility.getCompleteAddress(it.dropAddr[0])
            } else {
                mDropUpAddressValueTV.hide()
                mDropUpAddressLabelTV.hide()
            }

            if (it.PicList.isListNotEmpty()) {
                for (pic in it.PicList) {
                    addImagesInView(pic.File)
                }
            }
            mDeliveryAmountValueTV.text = "${mRsSymbol} ${it.purchaseamt}"
            mDeliveryStatusValueTV.text = it.packStatus
        }
    }

    private fun addImagesInView(imageUrl: String) {
        val contentView: View =
            LayoutInflater.from(mContext).inflate(R.layout.layout_package_attach_image_item, null)
        val attacheImageItem: AppCompatImageView = contentView.findViewById(R.id.iv_pkgDetail_image)

        contentView.tag = imageUrl

        contentView.setOnClickListener {
            try {
//                ActivityNavigator.navigateToImageFullScreen(mContext, contentView.tag.toString())
            } catch (ex : Exception){
                Timber.e("Exception caught in addImagesInView : ${ex.message}")
            }
        }
        val childCount: Int = mPackageAttachedImagesContainer.childCount
        var index = -1
        if (childCount > 0) {
            for (i in 0 until childCount) {
                val child: View = mPackageAttachedImagesContainer.getChildAt(i)
                if (child.tag == imageUrl) {
                    index = i
                    break
                }
            }
        }
        if (index > -1) {
            mPackageAttachedImagesContainer.removeViewAt(index)
        }
        ImageUtil.loadImage(mContext, imageUrl, attacheImageItem, false)
        mPackageAttachedImagesContainer.visibility = View.VISIBLE
        mPackageAttachedImagesContainer.addView(
            contentView,
            mPackageAttachedImagesContainer.childCount - 1
        )
    }

    @OnClick(R.id.btn_packageDetailScreen_trackDeliveryBtn)
    fun trackDeliveryBtnClick() {
        mHomeActivityListener?.changeFragment(TrackPackageDetailFragment.newInstance(mPackageId))
    }

    @OnClick(R.id.btn_packageDetailScreen_homeBtn)
    fun homeBtnClick() {
        mHomeActivityListener?.clearFragmentBackstack()
        mHomeActivityListener?.changeFragment(HomeFragment.newInstance())
    }
}