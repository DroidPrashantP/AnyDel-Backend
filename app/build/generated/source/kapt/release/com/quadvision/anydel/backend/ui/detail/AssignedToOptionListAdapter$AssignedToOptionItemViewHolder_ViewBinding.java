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

public final class AssignedToOptionListAdapter$AssignedToOptionItemViewHolder_ViewBinding implements Unbinder {
  private AssignedToOptionListAdapter.AssignedToOptionItemViewHolder target;

  @UiThread
  public AssignedToOptionListAdapter$AssignedToOptionItemViewHolder_ViewBinding(
      AssignedToOptionListAdapter.AssignedToOptionItemViewHolder target, View source) {
    this.target = target;

    target.mStatusNameTV = Utils.findRequiredViewAsType(source, R.id.tv_statusNameLabel, "field 'mStatusNameTV'", AppCompatTextView.class);
    target.mStatusDivider = Utils.findRequiredView(source, R.id.view_statusDivider, "field 'mStatusDivider'");

    Context context = source.getContext();
    target.mSelectedColor = ContextCompat.getColor(context, R.color.primary_color);
    target.mPrimaryTextColor = ContextCompat.getColor(context, R.color.text_primary_color);
  }

  @Override
  public void unbind() {
    AssignedToOptionListAdapter.AssignedToOptionItemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mStatusNameTV = null;
    target.mStatusDivider = null;
  }
}
