// Generated by view binder compiler. Do not edit!
package com.quadvision.anydel.backend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.quadvision.anydel.backend.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDeliveryCompletedBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnDeliveryCompletedScreenHome;

  @NonNull
  public final ConstraintLayout clDeliveryCompletedScreenBtnContainer;

  @NonNull
  public final RecyclerView rvDeliveryCompletedScreen;

  @NonNull
  public final AppCompatImageView tvDeliveryCompletedScreenAppLogo;

  @NonNull
  public final AppCompatTextView tvDeliveryCompletedScreenLabel;

  private FragmentDeliveryCompletedBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnDeliveryCompletedScreenHome,
      @NonNull ConstraintLayout clDeliveryCompletedScreenBtnContainer,
      @NonNull RecyclerView rvDeliveryCompletedScreen,
      @NonNull AppCompatImageView tvDeliveryCompletedScreenAppLogo,
      @NonNull AppCompatTextView tvDeliveryCompletedScreenLabel) {
    this.rootView = rootView;
    this.btnDeliveryCompletedScreenHome = btnDeliveryCompletedScreenHome;
    this.clDeliveryCompletedScreenBtnContainer = clDeliveryCompletedScreenBtnContainer;
    this.rvDeliveryCompletedScreen = rvDeliveryCompletedScreen;
    this.tvDeliveryCompletedScreenAppLogo = tvDeliveryCompletedScreenAppLogo;
    this.tvDeliveryCompletedScreenLabel = tvDeliveryCompletedScreenLabel;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDeliveryCompletedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDeliveryCompletedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_delivery_completed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDeliveryCompletedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_deliveryCompletedScreen_home;
      AppCompatButton btnDeliveryCompletedScreenHome = ViewBindings.findChildViewById(rootView, id);
      if (btnDeliveryCompletedScreenHome == null) {
        break missingId;
      }

      id = R.id.cl_deliveryCompletedScreen_btnContainer;
      ConstraintLayout clDeliveryCompletedScreenBtnContainer = ViewBindings.findChildViewById(rootView, id);
      if (clDeliveryCompletedScreenBtnContainer == null) {
        break missingId;
      }

      id = R.id.rv_deliveryCompletedScreen;
      RecyclerView rvDeliveryCompletedScreen = ViewBindings.findChildViewById(rootView, id);
      if (rvDeliveryCompletedScreen == null) {
        break missingId;
      }

      id = R.id.tv_deliveryCompletedScreen_appLogo;
      AppCompatImageView tvDeliveryCompletedScreenAppLogo = ViewBindings.findChildViewById(rootView, id);
      if (tvDeliveryCompletedScreenAppLogo == null) {
        break missingId;
      }

      id = R.id.tv_deliveryCompletedScreen_Label;
      AppCompatTextView tvDeliveryCompletedScreenLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvDeliveryCompletedScreenLabel == null) {
        break missingId;
      }

      return new FragmentDeliveryCompletedBinding((ConstraintLayout) rootView,
          btnDeliveryCompletedScreenHome, clDeliveryCompletedScreenBtnContainer,
          rvDeliveryCompletedScreen, tvDeliveryCompletedScreenAppLogo,
          tvDeliveryCompletedScreenLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
