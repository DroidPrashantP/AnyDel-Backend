// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.delivery;

import android.content.Context;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class DeliveryCompletedItemListAdapter$PickAddressItemViewHolder_ViewBinding implements Unbinder {
  private DeliveryCompletedItemListAdapter.PickAddressItemViewHolder target;

  @UiThread
  public DeliveryCompletedItemListAdapter$PickAddressItemViewHolder_ViewBinding(
      DeliveryCompletedItemListAdapter.PickAddressItemViewHolder target, View source) {
    this.target = target;

    target.mMainContainer = Utils.findRequiredViewAsType(source, R.id.mainContainer, "field 'mMainContainer'", ConstraintLayout.class);
    target.mPackageIdTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_packageIdValue, "field 'mPackageIdTV'", AppCompatTextView.class);
    target.mDeliveryDateValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_deliveryDateValue, "field 'mDeliveryDateValueTV'", AppCompatTextView.class);
    target.mDeliveryTimeValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_deliveryTimeValue, "field 'mDeliveryTimeValueTV'", AppCompatTextView.class);
    target.mDeliveryStatusValueTV = Utils.findRequiredViewAsType(source, R.id.tv_packageDetailScreen_statusValue, "field 'mDeliveryStatusValueTV'", AppCompatTextView.class);

    Context context = source.getContext();
    target.mDisableColor = ContextCompat.getColor(context, R.color.text_secondary_color);
    target.mEnableColor = ContextCompat.getColor(context, R.color.text_primary_color);
  }

  @Override
  public void unbind() {
    DeliveryCompletedItemListAdapter.PickAddressItemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMainContainer = null;
    target.mPackageIdTV = null;
    target.mDeliveryDateValueTV = null;
    target.mDeliveryTimeValueTV = null;
    target.mDeliveryStatusValueTV = null;
  }
}
