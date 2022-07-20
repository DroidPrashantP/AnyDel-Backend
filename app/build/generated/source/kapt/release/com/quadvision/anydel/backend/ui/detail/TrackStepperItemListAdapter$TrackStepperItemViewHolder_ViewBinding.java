// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.detail;

import android.content.Context;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class TrackStepperItemListAdapter$TrackStepperItemViewHolder_ViewBinding implements Unbinder {
  private TrackStepperItemListAdapter.TrackStepperItemViewHolder target;

  @UiThread
  public TrackStepperItemListAdapter$TrackStepperItemViewHolder_ViewBinding(
      TrackStepperItemListAdapter.TrackStepperItemViewHolder target, View source) {
    this.target = target;

    target.mStatusIndicatorTv = Utils.findRequiredViewAsType(source, R.id.tv_trackPackageDetailScreen_statusIndicator, "field 'mStatusIndicatorTv'", AppCompatTextView.class);
    target.mStatusViewTv = Utils.findRequiredView(source, R.id.view_trackPackageDetailScreen, "field 'mStatusViewTv'");
    target.mDashViewTV = Utils.findRequiredViewAsType(source, R.id.tv_trackPackageDetailScreen_dashView, "field 'mDashViewTV'", AppCompatTextView.class);
    target.mStatusLabel = Utils.findRequiredViewAsType(source, R.id.tv_trackPackageDetailScreen_statusLabel, "field 'mStatusLabel'", AppCompatTextView.class);

    Context context = source.getContext();
    target.mDisableColor = ContextCompat.getColor(context, R.color.text_secondary_color);
    target.mEnableColor = ContextCompat.getColor(context, R.color.primary_color);
    target.mSelectedRatioBtn = ContextCompat.getDrawable(context, R.drawable.ic_radion_btn_selected);
    target.mUnSelectedRatioBtn = ContextCompat.getDrawable(context, R.drawable.ic_rb_btn_unselected);
  }

  @Override
  public void unbind() {
    TrackStepperItemListAdapter.TrackStepperItemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mStatusIndicatorTv = null;
    target.mStatusViewTv = null;
    target.mDashViewTV = null;
    target.mStatusLabel = null;
  }
}
