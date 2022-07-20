package com.quadvision.anydel.backend.ui.detail

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
import com.quadvision.anydel.backend.data.model.UserType
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.SecuredSharePreferenceUtil
import com.quadvision.anydel.backend.utils.hide
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import com.quadvision.anydel.backend.utils.show


class AssignedToOptionListAdapter(var context: Context, var listener: AssignedToOptionListListener?) :
    RecyclerView.Adapter<AssignedToOptionListAdapter.AssignedToOptionItemViewHolder>() {

    private var mOptionsList = mutableListOf<UserType>()
    private var mSelectedItemPos = -1
    private var mLastSelectedPosition = -1

    interface AssignedToOptionListListener {
        fun selectUserType(userType: UserType?)
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): AssignedToOptionItemViewHolder {
        return AssignedToOptionItemViewHolder(
            LayoutInflater.from(context).inflate(R.layout.layout_status_list_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return mOptionsList?.size ?: 0
    }

    override fun onBindViewHolder(holder: AssignedToOptionItemViewHolder, position: Int) {
        holder.bind(position)
    }

    fun clearList() {
        mOptionsList?.let {
            it.clear()
            notifyDataSetChanged()
        }
    }

    fun updateStatusList(statusList: MutableList<UserType>?) {
        statusList?.let {
            mOptionsList.addAll(it)
            notifyDataSetChanged()
        }
    }

    inner class AssignedToOptionItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

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
            mOptionsList?.let {
                val userType = mOptionsList[position]
                var isCityStoredInPref = SecuredSharePreferenceUtil.getStringData(
                    SecuredSharePreferenceUtil.PREF_CURRENT_CITY, AnyDelConstant.EMPTY)

                if (isCityStoredInPref.isNotNullOrEmpty() && isCityStoredInPref!!.equals(userType.name, true)) {
                    mLastSelectedPosition = position // save the position which is selected
                    mStatusNameTV.setTextColor(mSelectedColor)
                    mStatusNameTV.typeface = Typeface.DEFAULT_BOLD
                } else {
                    mStatusNameTV.setTextColor(mPrimaryTextColor)
                    mStatusNameTV.typeface = Typeface.DEFAULT
                }

                mStatusNameTV.text = userType.name

                if (position == mOptionsList.size - 1) {
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
                    listener?.selectUserType(userType)
                }
            }
        }

    }
}