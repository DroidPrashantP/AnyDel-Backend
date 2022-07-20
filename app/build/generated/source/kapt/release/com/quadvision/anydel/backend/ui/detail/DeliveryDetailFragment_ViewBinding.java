// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.detail;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class DeliveryDetailFragment_ViewBinding implements Unbinder {
  private DeliveryDetailFragment target;

  private View view7f080129;

  private View view7f08004a;

  private View view7f080071;

  private View view7f08012a;

  private View view7f08006f;

  @UiThread
  public DeliveryDetailFragment_ViewBinding(final DeliveryDetailFragment target, View source) {
    this.target = target;

    View view;
    target.mPackageStatusTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_packageStatus, "field 'mPackageStatusTv'", AppCompatTextView.class);
    target.mPackageIdTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_packageIdValue, "field 'mPackageIdTV'", AppCompatTextView.class);
    target.mDeliveryDateLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_deliveryDateLabel, "field 'mDeliveryDateLabelTV'", AppCompatTextView.class);
    target.mDeliveryDateValueTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_deliveryDateValue, "field 'mDeliveryDateValueTV'", AppCompatTextView.class);
    target.mAssignedToLabelTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_assignToLabel, "field 'mAssignedToLabelTv'", AppCompatTextView.class);
    target.mAssignedToTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_assignToValue, "field 'mAssignedToTv'", AppCompatTextView.class);
    view = Utils.findRequiredView(source, R.id.iv_deliveryDetailScreen_assignToOptions, "field 'mAssignedToOptionTv' and method 'changeAssignToOptionClick'");
    target.mAssignedToOptionTv = Utils.castView(view, R.id.iv_deliveryDetailScreen_assignToOptions, "field 'mAssignedToOptionTv'", AppCompatImageView.class);
    view7f080129 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.changeAssignToOptionClick();
      }
    });
    target.mCustomNameLabelTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_customerNameLabel, "field 'mCustomNameLabelTv'", AppCompatTextView.class);
    target.mCustomNameTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_customerNameValue, "field 'mCustomNameTv'", AppCompatTextView.class);
    target.mAssignedByLabelTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_assignByLabel, "field 'mAssignedByLabelTv'", AppCompatTextView.class);
    target.mAssignedByTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_assignByValue, "field 'mAssignedByTv'", AppCompatTextView.class);
    target.mCustomerMobileNoLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_customerMobileNoLabel, "field 'mCustomerMobileNoLabelTV'", AppCompatTextView.class);
    target.mCustomerMobileNoTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_customerMobileNoValue, "field 'mCustomerMobileNoTV'", AppCompatTextView.class);
    target.mPickUpAddressLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_pickUpAddressLabel, "field 'mPickUpAddressLabelTV'", AppCompatTextView.class);
    target.mPickUpAddressValueTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_pickUpAddressValue, "field 'mPickUpAddressValueTV'", AppCompatTextView.class);
    target.mDropUpAddressLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_dropOffAddressLabel, "field 'mDropUpAddressLabelTV'", AppCompatTextView.class);
    target.mDropUpAddressValueTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_dropOffAddressValue, "field 'mDropUpAddressValueTV'", AppCompatTextView.class);
    target.mPickUpContactNoLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_pickUpPhoneNoLabel, "field 'mPickUpContactNoLabelTV'", AppCompatTextView.class);
    target.mPickUpContactNoValueTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_pickUpPhoneNoValue, "field 'mPickUpContactNoValueTV'", AppCompatEditText.class);
    target.mDropOffContactLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_dropOffPhoneNoLabel, "field 'mDropOffContactLabelTV'", AppCompatTextView.class);
    target.mDropOffContactValueTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_dropOffPhoneNoValue, "field 'mDropOffContactValueTV'", AppCompatEditText.class);
    target.mPackageTypeLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_packageTypeLabel, "field 'mPackageTypeLabelTV'", AppCompatTextView.class);
    target.mPackageTypeValueTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_packageTypeValue, "field 'mPackageTypeValueTV'", AppCompatTextView.class);
    target.mPackageDescLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_packageDescLabel, "field 'mPackageDescLabelTV'", AppCompatTextView.class);
    target.mPackageDescValueTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_packageDescValue, "field 'mPackageDescValueTV'", AppCompatTextView.class);
    target.mPackageWeightLabelTV = Utils.findRequiredViewAsType(source, R.id.dimen_tv_deliveryDetailScreen_packageWeightLabel, "field 'mPackageWeightLabelTV'", AppCompatTextView.class);
    target.mEdtPackageWeight = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_packageWeightValue, "field 'mEdtPackageWeight'", AppCompatEditText.class);
    target.mPackageSizeLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_packageSizeLabel, "field 'mPackageSizeLabelTV'", AppCompatTextView.class);
    target.mEdtPackageLength = Utils.findRequiredViewAsType(source, R.id.edt_packageInfo_lengthField, "field 'mEdtPackageLength'", AppCompatEditText.class);
    target.mEdtPackageBreadth = Utils.findRequiredViewAsType(source, R.id.edt_packageInfo_breadthField, "field 'mEdtPackageBreadth'", AppCompatEditText.class);
    target.mEdtPackageHeight = Utils.findRequiredViewAsType(source, R.id.edt_packageInfo_heightField, "field 'mEdtPackageHeight'", AppCompatEditText.class);
    target.mDeliveryAmountLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_amountLabel, "field 'mDeliveryAmountLabelTV'", AppCompatTextView.class);
    target.mDeliveryAmountValueTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_amountValue, "field 'mDeliveryAmountValueTV'", AppCompatTextView.class);
    target.mPaymentModeLabelTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_paymentModeLabel, "field 'mPaymentModeLabelTv'", AppCompatTextView.class);
    target.mPaymentModeTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_paymentMode, "field 'mPaymentModeTv'", AppCompatTextView.class);
    target.mCommentLabelTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_commentLabel, "field 'mCommentLabelTv'", AppCompatTextView.class);
    target.mCommentValueTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_commentValue, "field 'mCommentValueTv'", AppCompatTextView.class);
    target.mRejectedReasonLabelTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_rejectedReasonLabel, "field 'mRejectedReasonLabelTv'", AppCompatTextView.class);
    target.mRejectedReasonValueTv = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_rejectedReasonValue, "field 'mRejectedReasonValueTv'", AppCompatEditText.class);
    target.mPackagePhotoLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_deliveryDetailScreen_packagePhotoLabel, "field 'mPackagePhotoLabelTV'", AppCompatTextView.class);
    view = Utils.findRequiredView(source, R.id.add_image_btn, "field 'mAddImageBtn' and method 'uploadImage'");
    target.mAddImageBtn = Utils.castView(view, R.id.add_image_btn, "field 'mAddImageBtn'", AppCompatButton.class);
    view7f08004a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.uploadImage();
      }
    });
    target.mHorizontalScrollView = Utils.findRequiredViewAsType(source, R.id.ll_deliveryDetailScreen_HorizontalContainer, "field 'mHorizontalScrollView'", HorizontalScrollView.class);
    target.mPackageAttachedImagesContainer = Utils.findRequiredViewAsType(source, R.id.ll_deliveryDetailScreen_imagesContainer, "field 'mPackageAttachedImagesContainer'", LinearLayoutCompat.class);
    target.mSubmitRatingBtn = Utils.findRequiredViewAsType(source, R.id.btn_deliveryDetailScreen_ratingBtn, "field 'mSubmitRatingBtn'", AppCompatButton.class);
    target.mBtnUpdate = Utils.findRequiredViewAsType(source, R.id.btn_deliveryDetailScreen_updateBtn, "field 'mBtnUpdate'", AppCompatButton.class);
    view = Utils.findRequiredView(source, 2131230833, "method 'trackDeliveryBtnClick'");
    view7f080071 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.trackDeliveryBtnClick();
      }
    });
    view = Utils.findRequiredView(source, 2131231018, "method 'editPackageStatusClick'");
    view7f08012a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.editPackageStatusClick();
      }
    });
    view = Utils.findRequiredView(source, 2131230831, "method 'homeBtnClick'");
    view7f08006f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.homeBtnClick();
      }
    });

    Context context = source.getContext();
    Resources res = context.getResources();
    target.mRsSymbol = res.getString(R.string.Rs);
    target.mMaxImageSizeAlertMsg = res.getString(R.string.maximum_image_size_crossed_message);
  }

  @Override
  public void unbind() {
    DeliveryDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPackageStatusTv = null;
    target.mPackageIdTV = null;
    target.mDeliveryDateLabelTV = null;
    target.mDeliveryDateValueTV = null;
    target.mAssignedToLabelTv = null;
    target.mAssignedToTv = null;
    target.mAssignedToOptionTv = null;
    target.mCustomNameLabelTv = null;
    target.mCustomNameTv = null;
    target.mAssignedByLabelTv = null;
    target.mAssignedByTv = null;
    target.mCustomerMobileNoLabelTV = null;
    target.mCustomerMobileNoTV = null;
    target.mPickUpAddressLabelTV = null;
    target.mPickUpAddressValueTV = null;
    target.mDropUpAddressLabelTV = null;
    target.mDropUpAddressValueTV = null;
    target.mPickUpContactNoLabelTV = null;
    target.mPickUpContactNoValueTV = null;
    target.mDropOffContactLabelTV = null;
    target.mDropOffContactValueTV = null;
    target.mPackageTypeLabelTV = null;
    target.mPackageTypeValueTV = null;
    target.mPackageDescLabelTV = null;
    target.mPackageDescValueTV = null;
    target.mPackageWeightLabelTV = null;
    target.mEdtPackageWeight = null;
    target.mPackageSizeLabelTV = null;
    target.mEdtPackageLength = null;
    target.mEdtPackageBreadth = null;
    target.mEdtPackageHeight = null;
    target.mDeliveryAmountLabelTV = null;
    target.mDeliveryAmountValueTV = null;
    target.mPaymentModeLabelTv = null;
    target.mPaymentModeTv = null;
    target.mCommentLabelTv = null;
    target.mCommentValueTv = null;
    target.mRejectedReasonLabelTv = null;
    target.mRejectedReasonValueTv = null;
    target.mPackagePhotoLabelTV = null;
    target.mAddImageBtn = null;
    target.mHorizontalScrollView = null;
    target.mPackageAttachedImagesContainer = null;
    target.mSubmitRatingBtn = null;
    target.mBtnUpdate = null;

    view7f080129.setOnClickListener(null);
    view7f080129 = null;
    view7f08004a.setOnClickListener(null);
    view7f08004a = null;
    view7f080071.setOnClickListener(null);
    view7f080071 = null;
    view7f08012a.setOnClickListener(null);
    view7f08012a = null;
    view7f08006f.setOnClickListener(null);
    view7f08006f = null;
  }
}
