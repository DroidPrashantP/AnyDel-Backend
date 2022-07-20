// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.home;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class HomeFragment_ViewBinding implements Unbinder {
  private HomeFragment target;

  private View view7f08009d;

  private View view7f08009c;

  private View view7f08009e;

  private View view7f08009f;

  private View view7f0800a0;

  @UiThread
  public HomeFragment_ViewBinding(final HomeFragment target, View source) {
    this.target = target;

    View view;
    target.mSwipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout_deliveriesToComplete, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
    target.mWelcomeMsgTV = Utils.findRequiredViewAsType(source, R.id.tv_homeScreen_welcomeMsg, "field 'mWelcomeMsgTV'", AppCompatTextView.class);
    target.mPendingDeliveryRV = Utils.findRequiredViewAsType(source, R.id.rv_homeScreen_deliveriesToComplete, "field 'mPendingDeliveryRV'", RecyclerView.class);
    target.mProgressBarContainer = Utils.findRequiredViewAsType(source, R.id.cl_progressBarContainer, "field 'mProgressBarContainer'", ConstraintLayout.class);
    target.mEmptyContainer = Utils.findRequiredViewAsType(source, R.id.cl_empty_container, "field 'mEmptyContainer'", ConstraintLayout.class);
    target.mEmptyMessageTV = Utils.findRequiredViewAsType(source, R.id.tv_empty_message, "field 'mEmptyMessageTV'", AppCompatTextView.class);
    view = Utils.findRequiredView(source, 2131230877, "method 'clickOnDeliveryHistory'");
    view7f08009d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickOnDeliveryHistory();
      }
    });
    view = Utils.findRequiredView(source, 2131230876, "method 'clickOnServiceHistory'");
    view7f08009c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickOnServiceHistory();
      }
    });
    view = Utils.findRequiredView(source, 2131230878, "method 'clickOnAddressContainer'");
    view7f08009e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickOnAddressContainer();
      }
    });
    view = Utils.findRequiredView(source, 2131230879, "method 'clickOnProfileHistory'");
    view7f08009f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickOnProfileHistory();
      }
    });
    view = Utils.findRequiredView(source, 2131230880, "method 'clickOnSettingContainer'");
    view7f0800a0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickOnSettingContainer();
      }
    });

    Context context = source.getContext();
    Resources res = context.getResources();
    target.mWelcomeMsg = res.getString(R.string.welcome_msg);
  }

  @Override
  public void unbind() {
    HomeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSwipeRefreshLayout = null;
    target.mWelcomeMsgTV = null;
    target.mPendingDeliveryRV = null;
    target.mProgressBarContainer = null;
    target.mEmptyContainer = null;
    target.mEmptyMessageTV = null;

    view7f08009d.setOnClickListener(null);
    view7f08009d = null;
    view7f08009c.setOnClickListener(null);
    view7f08009c = null;
    view7f08009e.setOnClickListener(null);
    view7f08009e = null;
    view7f08009f.setOnClickListener(null);
    view7f08009f = null;
    view7f0800a0.setOnClickListener(null);
    view7f0800a0 = null;
  }
}
