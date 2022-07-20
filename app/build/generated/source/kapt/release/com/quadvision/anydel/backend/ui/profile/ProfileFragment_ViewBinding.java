// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.profile;

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

public final class ProfileFragment_ViewBinding implements Unbinder {
  private ProfileFragment target;

  private View view7f080139;

  private View view7f08007f;

  @UiThread
  public ProfileFragment_ViewBinding(final ProfileFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.iv_profileV5Header_userImage, "field 'mUserImageView' and method 'clickOnImageView'");
    target.mUserImageView = Utils.castView(view, R.id.iv_profileV5Header_userImage, "field 'mUserImageView'", AppCompatImageView.class);
    view7f080139 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickOnImageView();
      }
    });
    target.mTvNameField = Utils.findRequiredViewAsType(source, R.id.tv_profileScreen_nameField, "field 'mTvNameField'", AppCompatTextView.class);
    target.mTvSurnameField = Utils.findRequiredViewAsType(source, R.id.tv_profileScreen_surField, "field 'mTvSurnameField'", AppCompatTextView.class);
    target.mTvMobileField = Utils.findRequiredViewAsType(source, R.id.tv_profileScreen_mobileField, "field 'mTvMobileField'", AppCompatTextView.class);
    target.mTvEmailField = Utils.findRequiredViewAsType(source, R.id.tv_profileScreen_emailField, "field 'mTvEmailField'", AppCompatTextView.class);
    view = Utils.findRequiredView(source, 2131230847, "method 'clickOnHomeView'");
    view7f08007f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickOnHomeView();
      }
    });
  }

  @Override
  public void unbind() {
    ProfileFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mUserImageView = null;
    target.mTvNameField = null;
    target.mTvSurnameField = null;
    target.mTvMobileField = null;
    target.mTvEmailField = null;

    view7f080139.setOnClickListener(null);
    view7f080139 = null;
    view7f08007f.setOnClickListener(null);
    view7f08007f = null;
  }
}
