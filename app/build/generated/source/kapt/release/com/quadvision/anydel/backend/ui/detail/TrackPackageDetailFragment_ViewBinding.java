// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.detail;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class TrackPackageDetailFragment_ViewBinding implements Unbinder {
  private TrackPackageDetailFragment target;

  private View view7f080081;

  private View view7f080080;

  private View view7f080082;

  @UiThread
  public TrackPackageDetailFragment_ViewBinding(final TrackPackageDetailFragment target,
      View source) {
    this.target = target;

    View view;
    target.mPackageIdTV = Utils.findRequiredViewAsType(source, R.id.tv_trackPackageDetailScreen_packageIdValue, "field 'mPackageIdTV'", AppCompatTextView.class);
    target.mPackageDescMsgTV = Utils.findRequiredViewAsType(source, R.id.tv_trackPackageDetailScreen_headerDesc, "field 'mPackageDescMsgTV'", AppCompatTextView.class);
    target.mTrackStateRV = Utils.findRequiredViewAsType(source, R.id.rv_trackPackageDetail, "field 'mTrackStateRV'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.btn_trackPackageDetailScreen_deliveryDetailBtn, "field 'mDeliveryDetailBtn' and method 'deliveryDetailBtnClick'");
    target.mDeliveryDetailBtn = Utils.castView(view, R.id.btn_trackPackageDetailScreen_deliveryDetailBtn, "field 'mDeliveryDetailBtn'", AppCompatButton.class);
    view7f080081 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.deliveryDetailBtnClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_trackPackageDetailScreen_cancelDeliveryBtn, "field 'mCancelDeliveryBtn' and method 'cancelDeliveryBtnClick'");
    target.mCancelDeliveryBtn = Utils.castView(view, R.id.btn_trackPackageDetailScreen_cancelDeliveryBtn, "field 'mCancelDeliveryBtn'", AppCompatButton.class);
    view7f080080 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cancelDeliveryBtnClick();
      }
    });
    target.mProgressLayout = Utils.findRequiredViewAsType(source, R.id.cl_progressBarContainer, "field 'mProgressLayout'", ConstraintLayout.class);
    view = Utils.findRequiredView(source, 2131230850, "method 'homeBtnClick'");
    view7f080082 = view;
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
    TrackPackageDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPackageIdTV = null;
    target.mPackageDescMsgTV = null;
    target.mTrackStateRV = null;
    target.mDeliveryDetailBtn = null;
    target.mCancelDeliveryBtn = null;
    target.mProgressLayout = null;

    view7f080081.setOnClickListener(null);
    view7f080081 = null;
    view7f080080.setOnClickListener(null);
    view7f080080 = null;
    view7f080082.setOnClickListener(null);
    view7f080082 = null;
  }
}
