package com.quadvision.anydel.backend.ui.home

import android.content.Context
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindColor
import butterknife.BindView
import butterknife.ButterKnife
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.SecuredSharePreferenceUtil
import com.quadvision.anydel.backend.utils.hide
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import com.quadvision.anydel.backend.utils.show


class PackageStatusItemListAdapter(var context: Context, var listener: PackageStatusAdapterListener?) :
    RecyclerView.Adapter<PackageStatusItemListAdapter.CityItemViewHolder>() {

    private var mStatusList = mutableListOf<String>()
    private var mSelectedItemPos = -1
    private var mLastSelectedPosition = -1

    interface PackageStatusAdapterListener {
        fun selectStatus(status: String?)
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): CityItemViewHolder {
        return CityItemViewHolder(
            LayoutInflater.from(context).inflate(R.layout.layout_status_list_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return mStatusList?.size ?: 0
    }

    override fun onBindViewHolder(holder: CityItemViewHolder, position: Int) {
        holder.bind(position)
    }

    fun clearList() {
        mStatusList?.let {
            it.clear()
            notifyDataSetChanged()
        }
    }

    fun updateStatusList(statusList: MutableList<String>?) {
        statusList?.let {
            mStatusList.addAll(it)
            notifyDataSetChanged()
        }
    }

    inner class CityItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        @BindView(R.id.tv_statusNameLabel)
        lateinit var mStatusNameTV: AppCompatTextView

        @BindView(R.id.view_statusDivider)
        lateinit var mStatusDivider: View

        @JvmField
        @BindColor(R.color.primary_color)
        var mSelectedColor: Int = 0

        @JvmField
        @BindColor(R.color.text_primary_color)
        var mPrimaryTextColor: Int = 0

        init {
            ButterKnife.bind(this, view)
        }

        fun bind(position: Int) {
            mStatusList?.let {
                val status = mStatusList[position]
                var isCityStoredInPref = SecuredSharePreferenceUtil.getStringData(
                    SecuredSharePreferenceUtil.PREF_CURRENT_CITY, AnyDelConstant.EMPTY)

                if (isCityStoredInPref.isNotNullOrEmpty() && isCityStoredInPref!!.equals(status, true)) {
                    mLastSelectedPosition = position // save the position which is selected
                    mStatusNameTV.setTextColor(mSelectedColor)
                    mStatusNameTV.typeface = Typeface.DEFAULT_BOLD
                } else {
                    mStatusNameTV.setTextColor(mPrimaryTextColor)
                    mStatusNameTV.typeface = Typeface.DEFAULT
                }

                mStatusNameTV.text = status

                if (position == mStatusList.size - 1) {
                    mStatusDivider.hide()
                } else {
                    mStatusDivider.show()
                }
                mStatusNameTV.setOnClickListener {

                    mSelectedItemPos = adapterPosition
                    if (mLastSelectedPosition == -1)
                        mLastSelectedPosition = mSelectedItemPos
                    else {
                        notifyItemChanged(mLastSelectedPosition)
                        mLastSelectedPosition = mSelectedItemPos
                    }
                    notifyItemChanged(mSelectedItemPos)
                    listener?.selectStatus(status)
                }
            }
        }

    }
}