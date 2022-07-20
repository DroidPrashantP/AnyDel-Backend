// Generated code from Butter Knife. Do not modify!
package com.quadvision.anydel.backend.ui.home;

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

public final class CityItemListAdapter$CityItemViewHolder_ViewBinding implements Unbinder {
  private CityItemListAdapter.CityItemViewHolder target;

  @UiThread
  public CityItemListAdapter$CityItemViewHolder_ViewBinding(
      CityItemListAdapter.CityItemViewHolder target, View source) {
    this.target = target;

    target.mCityNameTV = Utils.findRequiredViewAsType(source, R.id.tv_cityNameLabel, "field 'mCityNameTV'", AppCompatTextView.class);
    target.mCityNameDivider = Utils.findRequiredView(source, R.id.view_cityNameDivider, "field 'mCityNameDivider'");

    Context context = source.getContext();
    target.mSelectedColor = ContextCompat.getColor(context, R.color.primary_color);
    target.mPrimaryTextColor = ContextCompat.getColor(context, R.color.text_primary_color);
  }

  @Override
  public void unbind() {
    CityItemListAdapter.CityItemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCityNameTV = null;
    target.mCityNameDivider = null;
  }
}
