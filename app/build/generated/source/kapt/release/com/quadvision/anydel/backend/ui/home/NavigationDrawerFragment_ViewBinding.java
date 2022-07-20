// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.home;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class NavigationDrawerFragment_ViewBinding implements Unbinder {
  private NavigationDrawerFragment target;

  private View view7f080275;

  private View view7f080274;

  private View view7f080277;

  @UiThread
  public NavigationDrawerFragment_ViewBinding(final NavigationDrawerFragment target, View source) {
    this.target = target;

    View view;
    target.mUserImageView = Utils.findRequiredViewAsType(source, R.id.iv_navigationDrawer_userImage, "field 'mUserImageView'", AppCompatImageView.class);
    target.mUserNameTV = Utils.findRequiredViewAsType(source, R.id.tv_navigationDrawer_username, "field 'mUserNameTV'", AppCompatTextView.class);
    target.mUserMobileTV = Utils.findRequiredViewAsType(source, R.id.tv_navigationDrawer_mobile, "field 'mUserMobileTV'", AppCompatTextView.class);
    view = Utils.findRequiredView(source, 2131231349, "method 'onLogoutClick'");
    view7f080275 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLogoutClick();
      }
    });
    view = Utils.findRequiredView(source, 2131231348, "method 'onAboutUsClick'");
    view7f080274 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAboutUsClick();
      }
    });
    view = Utils.findRequiredView(source, 2131231351, "method 'onNotificationClick'");
    view7f080277 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNotificationClick();
      }
    });
  }

  @Override
  public void unbind() {
    NavigationDrawerFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mUserImageView = null;
    target.mUserNameTV = null;
    target.mUserMobileTV = null;

    view7f080275.setOnClickListener(null);
    view7f080275 = null;
    view7f080274.setOnClickListener(null);
    view7f080274 = null;
    view7f080277.setOnClickListener(null);
    view7f080277 = null;
  }
}
