// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.login.ui.login;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.RadioGroup;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.quadvision.anydel.backend.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.mMainContainer = Utils.findRequiredViewAsType(source, R.id.coordinatorLayout_loginScreen, "field 'mMainContainer'", CoordinatorLayout.class);
    target.mToolBar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolBar'", Toolbar.class);
    target.mToolBarTitleTV = Utils.findRequiredViewAsType(source, R.id.tv_toolbarTitle, "field 'mToolBarTitleTV'", AppCompatTextView.class);
    target.mProgressBarContainer = Utils.findRequiredViewAsType(source, R.id.cl_progressBarContainer, "field 'mProgressBarContainer'", ConstraintLayout.class);
    target.mEdtMobileOrEmailField = Utils.findRequiredViewAsType(source, R.id.edt_loginScreen_emailMobileField, "field 'mEdtMobileOrEmailField'", AppCompatEditText.class);
    target.mEdtPasswordField = Utils.findRequiredViewAsType(source, R.id.edt_loginScreen_passwordField, "field 'mEdtPasswordField'", AppCompatEditText.class);
    target.mRoleContainerRadioGroup = Utils.findRequiredViewAsType(source, R.id.rg_loginScreen_roleContainer, "field 'mRoleContainerRadioGroup'", RadioGroup.class);
    target.mBtnLogin = Utils.findRequiredViewAsType(source, R.id.btn_loginScreen_login, "field 'mBtnLogin'", AppCompatButton.class);

    Context context = source.getContext();
    Resources res = context.getResources();
    target.mLoginValidationErrorMsg = res.getString(R.string.login_validation_error_message);
    target.mLoginMsg = res.getString(R.string.login);
  }

  @Override
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMainContainer = null;
    target.mToolBar = null;
    target.mToolBarTitleTV = null;
    target.mProgressBarContainer = null;
    target.mEdtMobileOrEmailField = null;
    target.mEdtPasswordField = null;
    target.mRoleContainerRadioGroup = null;
    target.mBtnLogin = null;
  }
}
