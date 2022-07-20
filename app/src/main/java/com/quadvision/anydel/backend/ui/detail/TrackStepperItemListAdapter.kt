package com.quadvision.anydel.backend.ui.detail

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindColor
import butterknife.BindDrawable
import butterknife.BindView
import butterknife.ButterKnife
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.PackageInfo
import com.quadvision.anydel.backend.data.model.TrackStepItem
import com.quadvision.anydel.backend.utils.CommonUtility
import com.quadvision.anydel.backend.utils.hide
import com.quadvision.anydel.backend.utils.show

class TrackStepperItemListAdapter(var context : Context) : RecyclerView.Adapter<TrackStepperItemListAdapter.TrackStepperItemViewHolder>() {

    private var mTrackerStepsList = mutableListOf<TrackStepItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackStepperItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_track_delivery_stepper_item, parent, false)
        return TrackStepperItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mTrackerStepsList?.size ?: 0
    }

    override fun onBindViewHolder(holder: TrackStepperItemViewHolder, position: Int) {
        holder.bind(position)
    }

    fun updateTrackerStepList(trackStepList: MutableList<TrackStepItem>?) {
        trackStepList?.let {
            mTrackerStepsList.addAll(it)
            notifyDataSetChanged()
        }
    }

    fun clearList() {
        mTrackerStepsList?.let {
            it.clear()
            notifyDataSetChanged()
        }
    }

    inner class TrackStepperItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        @BindView(R.id.tv_trackPackageDetailScreen_statusIndicator)
        lateinit var mStatusIndicatorTv: AppCompatTextView

        @BindView(R.id.view_trackPackageDetailScreen)
        lateinit var mStatusViewTv: View

        @BindView(R.id.tv_trackPackageDetailScreen_dashView)
        lateinit var mDashViewTV: AppCompatTextView

        @BindView(R.id.tv_trackPackageDetailScreen_statusLabel)
        lateinit var mStatusLabel: AppCompatTextView

        @BindDrawable(R.drawable.ic_radion_btn_selected)
        lateinit var mSelectedRatioBtn: Drawable

        @BindDrawable(R.drawable.ic_rb_btn_unselected)
        lateinit var mUnSelectedRatioBtn: Drawable

        @JvmField
        @BindColor(R.color.text_secondary_color)
        var mDisableColor: Int = 0

        @JvmField
        @BindColor(R.color.primary_color)
        var mEnableColor: Int = 0

        init {
            ButterKnife.bind(this, itemView)
        }

        fun bind(position: Int) {
            mTrackerStepsList?.let { list ->
                val trackerStepInfo = list[position]

                trackerStepInfo?.let {
                   if(position == list.size - 1){
                       mStatusViewTv.hide()
                   } else {
                       mStatusViewTv.show()
                   }

                    mStatusLabel.text = it.stepName.capitalize()
                   if(it.isSelected){
                       mStatusIndicatorTv.background = mSelectedRatioBtn
                       mStatusViewTv.setBackgroundColor(mEnableColor)
                       mStatusLabel.setTextColor(mEnableColor)
                   }else {
                       mStatusIndicatorTv.background = mUnSelectedRatioBtn
                       mStatusViewTv.setBackgroundColor(mDisableColor)
                       mStatusLabel.setTextColor(mDisableColor)
                   }
                }

            }
        }
    }
}