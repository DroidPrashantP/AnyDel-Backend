// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.delivery;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class CompletedDeliveryFragment_ViewBinding implements Unbinder {
  private CompletedDeliveryFragment target;

  private View view7f08006e;

  @UiThread
  public CompletedDeliveryFragment_ViewBinding(final CompletedDeliveryFragment target,
      View source) {
    this.target = target;

    View view;
    target.mDeliveryCompletedListRV = Utils.findRequiredViewAsType(source, R.id.rv_deliveryCompletedScreen, "field 'mDeliveryCompletedListRV'", RecyclerView.class);
    target.mProgressBarContainer = Utils.findRequiredViewAsType(source, R.id.cl_progressBarContainer, "field 'mProgressBarContainer'", ConstraintLayout.class);
    target.mEmptyContainer = Utils.findRequiredViewAsType(source, R.id.cl_empty_container, "field 'mEmptyContainer'", ConstraintLayout.class);
    target.mEmptyMessageTV = Utils.findRequiredViewAsType(source, R.id.tv_empty_message, "field 'mEmptyMessageTV'", AppCompatTextView.class);
    view = Utils.findRequiredView(source, 2131230830, "method 'clickOnHomeBtn'");
    view7f08006e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickOnHomeBtn();
      }
    });
  }

  @Override
  public void unbind() {
    CompletedDeliveryFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mDeliveryCompletedListRV = null;
    target.mProgressBarContainer = null;
    target.mEmptyContainer = null;
    target.mEmptyMessageTV = null;

    view7f08006e.setOnClickListener(null);
    view7f08006e = null;
  }
}
