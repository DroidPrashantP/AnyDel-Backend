package com.quadvision.anydel.backend.ui.detail

import PicList
import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import butterknife.*
import com.google.gson.Gson
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.*
import com.quadvision.anydel.backend.ui.ViewModelFactory
import com.quadvision.anydel.backend.ui.home.HomeActivity
import com.quadvision.anydel.backend.ui.home.HomeActivityListener
import com.quadvision.anydel.backend.ui.home.HomeFragment
import com.quadvision.anydel.backend.ui.home.PackageDetailViewModel
import com.quadvision.anydel.backend.ui.home.PackageStatusItemListAdapter
import com.quadvision.anydel.backend.ui.login.DialogActionListener
import com.quadvision.anydel.backend.utils.*
import timber.log.Timber
import java.io.File


class DeliveryDetailFragment : Fragment() {


    companion object {
        const val PACKAGE_DETAIL = "pck_detail"

        @JvmStatic
        fun newInstance(packageInfo: PackageInfo?, isDeliveryFlow: Boolean) =
            DeliveryDetailFragment().apply {
                mPackageInfoFromPreviousActivity = packageInfo
                mPackageId = mPackageInfoFromPreviousActivity?.packId
                mIsDeliveryFlow = isDeliveryFlow
            }
    }

    @BindView(R.id.tv_deliveryDetailScreen_packageStatus)
    lateinit var mPackageStatusTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_packageIdValue)
    lateinit var mPackageIdTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_deliveryDateLabel)
    lateinit var mDeliveryDateLabelTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_deliveryDateValue)
    lateinit var mDeliveryDateValueTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_assignToLabel)
    lateinit var mAssignedToLabelTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_assignToValue)
    lateinit var mAssignedToTv: AppCompatTextView

    @BindView(R.id.iv_deliveryDetailScreen_assignToOptions)
    lateinit var mAssignedToOptionTv: AppCompatImageView

    @BindView(R.id.tv_deliveryDetailScreen_customerNameLabel)
    lateinit var mCustomNameLabelTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_customerNameValue)
    lateinit var mCustomNameTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_assignByLabel)
    lateinit var mAssignedByLabelTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_assignByValue)
    lateinit var mAssignedByTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_customerMobileNoLabel)
    lateinit var mCustomerMobileNoLabelTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_customerMobileNoValue)
    lateinit var mCustomerMobileNoTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_pickUpAddressLabel)
    lateinit var mPickUpAddressLabelTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_pickUpAddressValue)
    lateinit var mPickUpAddressValueTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_dropOffAddressLabel)
    lateinit var mDropUpAddressLabelTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_dropOffAddressValue)
    lateinit var mDropUpAddressValueTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_pickUpPhoneNoLabel)
    lateinit var mPickUpContactNoLabelTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_pickUpPhoneNoValue)
    lateinit var mPickUpContactNoValueTV: AppCompatEditText

    @BindView(R.id.tv_deliveryDetailScreen_dropOffPhoneNoLabel)
    lateinit var mDropOffContactLabelTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_dropOffPhoneNoValue)
    lateinit var mDropOffContactValueTV: AppCompatEditText

    @BindView(R.id.tv_deliveryDetailScreen_packageTypeLabel)
    lateinit var mPackageTypeLabelTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_packageTypeValue)
    lateinit var mPackageTypeValueTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_packageDescLabel)
    lateinit var mPackageDescLabelTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_packageDescValue)
    lateinit var mPackageDescValueTV: AppCompatTextView

    @BindView(R.id.dimen_tv_deliveryDetailScreen_packageWeightLabel)
    lateinit var mPackageWeightLabelTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_packageWeightValue)
    lateinit var mEdtPackageWeight: AppCompatEditText

    @BindView(R.id.tv_deliveryDetailScreen_packageSizeLabel)
    lateinit var mPackageSizeLabelTV: AppCompatTextView

    @BindView(R.id.edt_packageInfo_lengthField)
    lateinit var mEdtPackageLength: AppCompatEditText

    @BindView(R.id.edt_packageInfo_breadthField)
    lateinit var mEdtPackageBreadth: AppCompatEditText

    @BindView(R.id.edt_packageInfo_heightField)
    lateinit var mEdtPackageHeight: AppCompatEditText

    @BindView(R.id.tv_deliveryDetailScreen_amountLabel)
    lateinit var mDeliveryAmountLabelTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_amountValue)
    lateinit var mDeliveryAmountValueTV: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_paymentModeLabel)
    lateinit var mPaymentModeLabelTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_paymentMode)
    lateinit var mPaymentModeTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_commentLabel)
    lateinit var mCommentLabelTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_commentValue)
    lateinit var mCommentValueTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_rejectedReasonLabel)
    lateinit var mRejectedReasonLabelTv: AppCompatTextView

    @BindView(R.id.tv_deliveryDetailScreen_rejectedReasonValue)
    lateinit var mRejectedReasonValueTv: AppCompatEditText

    @BindView(R.id.tv_deliveryDetailScreen_packagePhotoLabel)
    lateinit var mPackagePhotoLabelTV: AppCompatTextView

    @BindView(R.id.add_image_btn)
    lateinit var mAddImageBtn: AppCompatButton

    @BindView(R.id.ll_deliveryDetailScreen_HorizontalContainer)
    lateinit var mHorizontalScrollView: HorizontalScrollView

    @BindView(R.id.ll_deliveryDetailScreen_imagesContainer)
    lateinit var mPackageAttachedImagesContainer: LinearLayoutCompat

    @BindView(R.id.btn_deliveryDetailScreen_ratingBtn)
    lateinit var mSubmitRatingBtn: AppCompatButton

    @BindView(R.id.btn_deliveryDetailScreen_updateBtn)
    lateinit var mBtnUpdate: AppCompatButton


    @BindString(R.string.Rs)
    lateinit var mRsSymbol: String

    @BindString(R.string.maximum_image_size_crossed_message)
    lateinit var mMaxImageSizeAlertMsg: String

    private lateinit var mContext: Context
    private var mButterKnifeUnBinder: Unbinder? = null
    private var mHomeActivityListener: HomeActivityListener? = null
    private var mPackageDetailViewModel: PackageDetailViewModel? = null
    private var mAttachedImagesList: ArrayList<PicList>? = null
    private var mPackageInfoFromPreviousActivity: PackageInfo? = null
    private var mPackageId: String? = null
    private var mPackageStatus: String? = null
    private var mAssignedToSelection: String? = null
    private var mAssignedBySelection: String? = null
    private var mPackgeInfo: PackageInfo? = null
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
        val fragmentView = inflater.inflate(R.layout.fragment_delivery_detail, container, false)
        mButterKnifeUnBinder = ButterKnife.bind(this, fragmentView)
        return fragmentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DialogUtils.showProgressDialog(mContext, "Fetching the Delivery Data")
        setUpViewModel()
        observerData()
        enableViewBasedOnTheRole()
        setUpView()
        loadData()
    }

    private fun enableViewBasedOnTheRole() {
        if (!CommonUtility.isUserSuperAdmin()) {
            mPickUpAddressLabelTV.hide()
            mPickUpAddressValueTV.hide()

            mDropUpAddressLabelTV.hide()
            mDropUpAddressValueTV.hide()

            mDeliveryDateLabelTV.hide()
            mDeliveryDateValueTV.hide()

            mPackageTypeLabelTV.hide()
            mPackageTypeValueTV.hide()

            mPackageDescLabelTV.hide()
            mPackageDescValueTV.hide()

            mPaymentModeLabelTv.hide()
            mPaymentModeTv.hide()

            mRejectedReasonLabelTv.hide()
            mRejectedReasonValueTv.hide()

            mAssignedToLabelTv.hide()
            mAssignedToTv.hide()
            mAssignedToOptionTv.hide()

            mAssignedByLabelTv.hide()
            mAssignedByTv.hide()

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
        mBtnUpdate?.setOnClickListener {
            try {
                mPackgeInfo?.let {
                    var weight = mEdtPackageWeight.text.toString()
                    var length = mEdtPackageLength.text.toString()
                    var breadth = mEdtPackageBreadth.text.toString()
                    var height = mEdtPackageHeight.text.toString()
                    var rejectedReason = if (mRejectedReasonValueTv.text.toString()
                            .isNotNullOrEmpty()
                    ) mRejectedReasonValueTv.text.toString() else null

                    var pickUpContactNumber = if (mPickUpContactNoValueTV.text.toString()
                            .isNotNullOrEmpty()
                    ) mPickUpContactNoValueTV.text.toString().appendZeroToMobileNumber() else null

                    var dropUpContactNumber = if (mDropOffContactValueTV.text.toString()
                            .isNotNullOrEmpty()
                    ) mDropOffContactValueTV.text.toString() else null

                    if (it.PicList.isListNotEmpty()) {
                        mAttachedImagesList?.addAll(it.PicList)
                    }
                    var pictList = mAttachedImagesList
                    if (weight.strToInt() > 0 && length.strToInt() > 0 && breadth.strToInt() > 0 && height.strToInt() > 0) {
                        DialogUtils.showProgressDialog(mContext, "Updating data...")
                        mPackageDetailViewModel?.updatePackageDetail(
                            UpdatePackageDetailPayload(
                                CommonUtility.getUserMobileData().appendZeroToMobileNumber(),
                                it.mobileNo.appendZeroToMobileNumber(),
                                it.packId,
                                it.packStatus,
                                weight.strToInt(),
                                length.strToInt(),
                                breadth.strToInt(),
                                height.strToInt(),
                                rejectedReason,
                                mAssignedToSelection,
                                mAssignedBySelection,
                                pictList,
                                pickUpContactNumber,
                                dropUpContactNumber.appendZeroToMobileNumber()
                            )
                        )
                    } else {
                        mContext?.showToast("Please add the valid Size and Weight")
                    }
                }
            } catch (Ex: Exception) {
                Timber.e("Exception caught in ${Ex.message}")
            }
        }

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

        mPackageDetailViewModel?.updatePackageDetailResult?.observe(viewLifecycleOwner, Observer {
            if (viewLifecycleOwner.lifecycle.currentState == Lifecycle.State.RESUMED) {
                DialogUtils.hideProgressDialog()
                val pckDetailResult = it ?: return@Observer
                if (pckDetailResult.success != null) {
                    DialogUtils.hideProgressDialog()
                    DialogUtils.showCustomDialog(
                        mContext, getString(R.string.success),
                        getString(R.string.package_update_successfully),
                        false, false, object : DialogActionListener {
                            override fun onOkayBtnClick() {
                                mHomeActivityListener?.changeFragment(HomeFragment.newInstance())
                            }
                        }, false, false
                    )
                } else {
                    DialogUtils.hideProgressDialog()
                    pckDetailResult.error?.let { error ->
                        mContext.showToast(error)
                    }
                }
            }
        })

        mPackageDetailViewModel?.fileUploadResult?.observe(viewLifecycleOwner, Observer {
            if (viewLifecycleOwner.lifecycle.currentState == Lifecycle.State.RESUMED) {
                val fileUploadResult = it ?: return@Observer
                if (fileUploadResult.success != null) {
                    val apiResponse = fileUploadResult.success as FileUpload
                    if (apiResponse != null) {
                        DialogUtils.hideProgressDialog()
                        addImagesInView(apiResponse.fileDownloadUri!!)
                        mAttachedImagesList?.add(
                            PicList(
                                Type = "ITEMLIST",
                                Name = apiResponse.fileName!!,
                                File = apiResponse.fileDownloadUri!!
                            )
                        )
                    }
                } else {
                    DialogUtils.hideProgressDialog()
                    mContext.showToast("Image uploading failed!")
                }
            }
        })
    }

    private fun updateUI(packageSubmit: PackageInfo?, apiType: String) {

        packageSubmit?.let {
            mPackgeInfo = it

            mPackageInfoFromPreviousActivity?.let { previousPackageInfo ->
                mPackageStatus = previousPackageInfo.packStatus
                mPackageStatusTv.text = previousPackageInfo.packStatus
                mAssignedToTv.text = previousPackageInfo.assignedTo
                mAssignedToSelection = previousPackageInfo.assignedTo
                mPackageTypeValueTV.text = previousPackageInfo.packType

                if (previousPackageInfo.assignedBy.isNotNullOrEmpty()) {
                    mAssignedByTv.text = previousPackageInfo.assignedBy
                } else {
                    var user = CommonUtility.getUserData()
                    user?.let { userInfo ->
                        mAssignedBySelection = userInfo.firstName.plus(" ").plus(userInfo.lastName)
                        mAssignedByTv.text = userInfo.firstName.plus(" ").plus(userInfo.lastName)
                    }
                }

            }

            mCustomNameTv.text = if (it.customerName.isNotNullOrEmpty()) {
                it.customerName
            } else {
                it.receiverName
            }

            mPackageIdTV.text = it.packId
            mDeliveryDateValueTV.text =
                it.DeliveryDate.plus(" At ").plus(CommonUtility.getFormattedTime(it.DeliveryTime))

            mCustomerMobileNoTV.text = it.mobileNo.removeZeroToMobileNumber()

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
            mDeliveryAmountValueTV.text = "${it.purchaseamt}"

            if (AnyDelConstant.COMPLETED.equals(it.packStatus, true)) {
                mSubmitRatingBtn.show()
            } else {
                mSubmitRatingBtn.hide()
            }
            mPickUpContactNoValueTV.setText(it.pickContactNo.removeZeroToMobileNumber())
            mDropOffContactValueTV.setText(it.dropContactNo.removeZeroToMobileNumber())

            mEdtPackageWeight.setText("${it.packWeight}")
            mEdtPackageLength.setText("${it.packLength}")
            mEdtPackageBreadth.setText("${it.packBreadth}")
            mEdtPackageHeight.setText("${it.packHeight}")

            if (it.custComment.isNotNullOrEmpty()) {
                mCommentValueTv.show()
                mCommentLabelTv.show()
                mCommentValueTv.text = it.custComment
            } else {
                mCommentValueTv.hide()
                mCommentLabelTv.hide()
            }

            mPaymentModeTv.text = it.PaymentMode
            mPackageTypeValueTV.text = it.packType
            mPackageDescValueTV.text = it.packDescription

            if (it.PicList.isListNotEmpty()) {
                for (pic in it.PicList) {
                    addImagesInView(pic.File)
                }
            } else {
//                mHorizontalScrollView.hide()
            }
        }
    }

    private fun showHideRejectReasonView(status: String) {
        if (AnyDelConstant.REJECTED.equals(status, true)) {
            mRejectedReasonLabelTv.show()
            mRejectedReasonValueTv.show()
        } else {
            mRejectedReasonLabelTv.hide()
            mRejectedReasonValueTv.hide()
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
            } catch (ex: Exception) {
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

    @OnClick(R.id.btn_deliveryDetailScreen_trackDeliveryBtn)
    fun trackDeliveryBtnClick() {
        mHomeActivityListener?.changeFragment(TrackPackageDetailFragment.newInstance(mPackageId))
    }

    @OnClick(R.id.add_image_btn)
    fun uploadImage() {
        requestForEditImageFeaturePermission()
    }

    @OnClick(R.id.iv_deliveryDetailScreen_editPackageStatus)
    fun editPackageStatusClick() {
        DialogUtils.setThePackageStatus(
            mContext,
            if (CommonUtility.isUserSuperAdmin()) AnyDelConstant.getStatusList() else AnyDelConstant.getDelBoyStatusList(),
            object :
                PackageStatusItemListAdapter.PackageStatusAdapterListener {
                override fun selectStatus(status: String?) {
                    status?.let { cc ->
                        mBtnUpdate.show()
                        mPackageStatusTv.text = status
                        mPackageStatus = status
                        mPackgeInfo?.let {
                            it.packStatus = status
                        }

                        if (CommonUtility.isUserSuperAdmin() && AnyDelConstant.REJECTED.equals(
                                status,
                                true
                            )
                        ) {
                            showHideRejectReasonView(status)
                        }
                    }
                }

            })
    }

    @OnClick(R.id.iv_deliveryDetailScreen_assignToOptions)
    fun changeAssignToOptionClick() {
        var citiesData = Gson().fromJson(
            SecuredSharePreferenceUtil.getStringData(
                SecuredSharePreferenceUtil.CITIES_DATA,
                ""
            ), CitiesData::class.java
        )

        citiesData?.cities?.let {
            DialogUtils.setTheAssignedToOptions(mContext, it[0].deliveryboys, object :
                AssignedToOptionListAdapter.AssignedToOptionListListener {
                override fun selectUserType(userType: UserType?) {
                    userType?.let { ut ->
                        mAssignedToTv.text = ut.name
                        mAssignedToSelection = ut.name
                    }
                }

            })
        }
    }

    @OnClick(R.id.btn_deliveryDetailScreen_homeBtn)
    fun homeBtnClick() {
        mHomeActivityListener?.clearFragmentBackstack()
        mHomeActivityListener?.changeFragment(HomeFragment.newInstance())
    }

    private fun requestForEditImageFeaturePermission() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (ActivityCompat.checkSelfPermission(
                        mContext,
                        Manifest.permission.CAMERA
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    requestPermissions(
                        arrayOf(Manifest.permission.CAMERA),
                        PermissionUtil.PERMISSIONS_REQUEST_CAMERA
                    )
                } else if (ActivityCompat.checkSelfPermission(
                        mContext,
                        Manifest.permission.READ_EXTERNAL_STORAGE
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    requestPermissions(
                        arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                        PermissionUtil.PERMISSIONS_REQUEST_EXTERNAL_STORAGE
                    )
                } else {
                    CameraUtils.openImagePickerChooser(mContext)
                }
            }
        } catch (Ex: Exception) {
            Timber.e("Exception caught in requestForEditImageFeaturePermission ${Ex.message}")
        }
    }

    fun setCoverImagePath(uri: Uri) {
        uri?.let {
            val path = FileUtils.getPath(it)
            val fl = File(path)
            if (fl.length() <= AnyDelConstant.MAX_IMAGE_SIZE_TWO_MB) {
                DialogUtils.showProgressDialog(mContext, "Uploading in progress..")
                var customerNo: String? = mCustomerMobileNoTV.text.toString() ?: null
                mPackageDetailViewModel?.updateImageFile(MultiPartRequestPayload().apply {
                    file = path
                    mobileNo = customerNo.appendZeroToMobileNumber()
                    type = AnyDelConstant.DELIVERY_IMAGE_UPLOADING
                })
            } else {
                mContext.showToast(mMaxImageSizeAlertMsg)
            }
        }
    }
}