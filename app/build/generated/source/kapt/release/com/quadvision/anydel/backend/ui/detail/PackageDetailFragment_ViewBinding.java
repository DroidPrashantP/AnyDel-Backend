// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.detail;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class PackageDetailFragment_ViewBinding implements Unbinder {
  private PackageDetailFragment target;

  private View view7f08007b;

  private View view7f080079;

  @UiThread
  public PackageDetailFragment_ViewBinding(final PackageDetailFragment target, View source) {
    this.target = target;

    View view;
    target.mPackageIdTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_packageIdValue, "field 'mPackageIdTV'", AppCompatTextView.class);
    target.mDeliveryDateValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_deliveryDateValue, "field 'mDeliveryDateValueTV'", AppCompatTextView.class);
    target.mDeliveryTimeValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_deliveryTimeValue, "field 'mDeliveryTimeValueTV'", AppCompatTextView.class);
    target.mPickUpAddressLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_pickUpAddressLabel, "field 'mPickUpAddressLabelTV'", AppCompatTextView.class);
    target.mPickUpAddressValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_pickUpAddressValue, "field 'mPickUpAddressValueTV'", AppCompatTextView.class);
    target.mDropUpAddressLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_dropOffAddressLabel, "field 'mDropUpAddressLabelTV'", AppCompatTextView.class);
    target.mDropUpAddressValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_dropOffAddressValue, "field 'mDropUpAddressValueTV'", AppCompatTextView.class);
    target.mBookingDateValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_bookingDateValue, "field 'mBookingDateValueTV'", AppCompatTextView.class);
    target.mBookingTimeValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_bookingTimeValue, "field 'mBookingTimeValueTV'", AppCompatTextView.class);
    target.mDeliveryStatusLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_statusLabel, "field 'mDeliveryStatusLabelTV'", AppCompatTextView.class);
    target.mDeliveryStatusValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_statusValue, "field 'mDeliveryStatusValueTV'", AppCompatTextView.class);
    target.mDeliveryAmountValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_amountValue, "field 'mDeliveryAmountValueTV'", AppCompatTextView.class);
    target.mPackageAttachedImagesContainer = Utils.findRequiredViewAsType(source, R.id.ll_packageDetailScreen_imagesContainer, "field 'mPackageAttachedImagesContainer'", LinearLayoutCompat.class);
    view = Utils.findRequiredView(source, 2131230843, "method 'trackDeliveryBtnClick'");
    view7f08007b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.trackDeliveryBtnClick();
      }
    });
    view = Utils.findRequiredView(source, 2131230841, "method 'homeBtnClick'");
    view7f080079 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.homeBtnClick();
      }
    });

    Context context = source.getContext();
    Resources res = context.getResources();
    target.mRsSymbol = res.getString(R.string.Rs);
  }

  @Override
  public void unbind() {
    PackageDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPackageIdTV = null;
    target.mDeliveryDateValueTV = null;
    target.mDeliveryTimeValueTV = null;
    target.mPickUpAddressLabelTV = null;
    target.mPickUpAddressValueTV = null;
    target.mDropUpAddressLabelTV = null;
    target.mDropUpAddressValueTV = null;
    target.mBookingDateValueTV = null;
    target.mBookingTimeValueTV = null;
    target.mDeliveryStatusLabelTV = null;
    target.mDeliveryStatusValueTV = null;
    target.mDeliveryAmountValueTV = null;
    target.mPackageAttachedImagesContainer = null;

    view7f08007b.setOnClickListener(null);
    view7f08007b = null;
    view7f080079.setOnClickListener(null);
    view7f080079 = null;
  }
}
