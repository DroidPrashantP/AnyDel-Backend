// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.home;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class HomeActivity_ViewBinding implements Unbinder {
  private HomeActivity target;

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target, View source) {
    this.target = target;

    target.mHomeDrawerLayout = Utils.findRequiredViewAsType(source, R.id.drawerLayout_Home, "field 'mHomeDrawerLayout'", DrawerLayout.class);
    target.mToolBar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolBar'", Toolbar.class);
    target.mToolBarTitle = Utils.findRequiredViewAsType(source, R.id.tv_toolbarTitle, "field 'mToolBarTitle'", AppCompatTextView.class);
    target.mNavigationDrawerIcon = Utils.findRequiredViewAsType(source, R.id.iv_home_navDrawerIcon, "field 'mNavigationDrawerIcon'", AppCompatImageView.class);
  }

  @Override
  public void unbind() {
    HomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mHomeDrawerLayout = null;
    target.mToolBar = null;
    target.mToolBarTitle = null;
    target.mNavigationDrawerIcon = null;
  }
}
