// Generated by view binder compiler. Do not edit!
package com.quadvision.anydel.backend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.quadvision.anydel.backend.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutEmptyViewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final ConstraintLayout clEmptyContainer;

  @NonNull
  public final AppCompatImageView ivEmptyImage;

  @NonNull
  public final AppCompatTextView tvEmptyMessage;

  private LayoutEmptyViewBinding(@NonNull ConstraintLayout rootView,
      @NonNull LottieAnimationView animationView, @NonNull ConstraintLayout clEmptyContainer,
      @NonNull AppCompatImageView ivEmptyImage, @NonNull AppCompatTextView tvEmptyMessage) {
    this.rootView = rootView;
    this.animationView = animationView;
    this.clEmptyContainer = clEmptyContainer;
    this.ivEmptyImage = ivEmptyImage;
    this.tvEmptyMessage = tvEmptyMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutEmptyViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutEmptyViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_empty_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutEmptyViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animationView;
      LottieAnimationView animationView = ViewBindings.findChildViewById(rootView, id);
      if (animationView == null) {
        break missingId;
      }

      ConstraintLayout clEmptyContainer = (ConstraintLayout) rootView;

      id = R.id.iv_empty_image;
      AppCompatImageView ivEmptyImage = ViewBindings.findChildViewById(rootView, id);
      if (ivEmptyImage == null) {
        break missingId;
      }

      id = R.id.tv_empty_message;
      AppCompatTextView tvEmptyMessage = ViewBindings.findChildViewById(rootView, id);
      if (tvEmptyMessage == null) {
        break missingId;
      }

      return new LayoutEmptyViewBinding((ConstraintLayout) rootView, animationView,
          clEmptyContainer, ivEmptyImage, tvEmptyMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
