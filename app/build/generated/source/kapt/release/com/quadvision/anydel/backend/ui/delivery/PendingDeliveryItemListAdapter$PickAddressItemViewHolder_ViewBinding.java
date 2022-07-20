// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.delivery;

import android.content.Context;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class PendingDeliveryItemListAdapter$PickAddressItemViewHolder_ViewBinding implements Unbinder {
  private PendingDeliveryItemListAdapter.PickAddressItemViewHolder target;

  @UiThread
  public PendingDeliveryItemListAdapter$PickAddressItemViewHolder_ViewBinding(
      PendingDeliveryItemListAdapter.PickAddressItemViewHolder target, View source) {
    this.target = target;

    target.mMainContainer = Utils.findRequiredViewAsType(source, R.id.mainContainer, "field 'mMainContainer'", ConstraintLayout.class);
    target.mPackageIdTV = Utils.findRequiredViewAsType(source, R.id.tv_pendingDeliveryScreen_packageIdValue, "field 'mPackageIdTV'", AppCompatTextView.class);
    target.mDeliveryDateAndTimeValueTV = Utils.findRequiredViewAsType(source, R.id.tv_pendingDeliveryScreen_deliveryDateTimeValue, "field 'mDeliveryDateAndTimeValueTV'", AppCompatTextView.class);
    target.mNameTv = Utils.findRequiredViewAsType(source, R.id.tv_pendingDeliveryScreen_deliveryDateValue, "field 'mNameTv'", AppCompatTextView.class);
    target.mDeliveryStatusValueTV = Utils.findRequiredViewAsType(source, R.id.tv_pendingDeliveryScreen_deliveryStatusValue, "field 'mDeliveryStatusValueTV'", AppCompatTextView.class);
    target.mAssignedToLabelTV = Utils.findRequiredViewAsType(source, R.id.tv_pendingDeliveryScreen_pendingActionLabel, "field 'mAssignedToLabelTV'", AppCompatTextView.class);
    target.mAssignedToValueTV = Utils.findRequiredViewAsType(source, R.id.tv_pendingDeliveryScreen_pendingActionValue, "field 'mAssignedToValueTV'", AppCompatTextView.class);
    target.mBtnTakeAction = Utils.findRequiredViewAsType(source, R.id.btn_pendingDeliveryScreen_takeAction, "field 'mBtnTakeAction'", AppCompatButton.class);

    Context context = source.getContext();
    target.mDisableColor = ContextCompat.getColor(context, R.color.text_secondary_color);
    target.mEnableColor = ContextCompat.getColor(context, R.color.text_primary_color);
  }

  @Override
  public void unbind() {
    PendingDeliveryItemListAdapter.PickAddressItemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMainContainer = null;
    target.mPackageIdTV = null;
    target.mDeliveryDateAndTimeValueTV = null;
    target.mNameTv = null;
    target.mDeliveryStatusValueTV = null;
    target.mAssignedToLabelTV = null;
    target.mAssignedToValueTV = null;
    target.mBtnTakeAction = null;
  }
}
