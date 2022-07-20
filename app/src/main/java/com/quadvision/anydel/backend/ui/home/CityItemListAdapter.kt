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
import com.quadvision.anydel.backend.data.model.City
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.SecuredSharePreferenceUtil
import com.quadvision.anydel.backend.utils.hide
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import com.quadvision.anydel.backend.utils.show


class CityItemListAdapter(var context: Context, var listener: CityListAdapterListener?) :
    RecyclerView.Adapter<CityItemListAdapter.CityItemViewHolder>() {

    private var mCityList = mutableListOf<City>()
    private var mSelectedItemPos = -1
    private var mLastSelectedPosition = -1

    interface CityListAdapterListener {
        fun selectCity(city: City?)
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): CityItemViewHolder {
        return CityItemViewHolder(
            LayoutInflater.from(context).inflate(R.layout.layout_city_list_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return mCityList?.size ?: 0
    }

    override fun onBindViewHolder(holder: CityItemViewHolder, position: Int) {
        holder.bind(position)
    }

    fun clearList() {
        mCityList?.let {
            it.clear()
            notifyDataSetChanged()
        }
    }

    fun updateCityList(cityList: MutableList<City>?) {
        cityList?.let {
            mCityList.addAll(it)
            notifyDataSetChanged()
        }
    }

    inner class CityItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        @BindView(R.id.tv_cityNameLabel)
        lateinit var mCityNameTV: AppCompatTextView

        @BindView(R.id.view_cityNameDivider)
        lateinit var mCityNameDivider: View

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
            mCityList?.let {
                val city = mCityList[position]
                var isCityStoredInPref = SecuredSharePreferenceUtil.getStringData(
                    SecuredSharePreferenceUtil.PREF_CURRENT_CITY, AnyDelConstant.EMPTY)

                if (isCityStoredInPref.isNotNullOrEmpty() && isCityStoredInPref!!.equals(city.name, true)) {
                    mLastSelectedPosition = position // save the position which is selected
                    mCityNameTV.setTextColor(mSelectedColor)
                    mCityNameTV.typeface = Typeface.DEFAULT_BOLD
                } else {
                    mCityNameTV.setTextColor(mPrimaryTextColor)
                    mCityNameTV.typeface = Typeface.DEFAULT
                }

                mCityNameTV.text = city.name

                if (position == mCityList.size - 1) {
                    mCityNameDivider.hide()
                } else {
                    mCityNameDivider.show()
                }
                mCityNameTV.setOnClickListener {

                    mSelectedItemPos = adapterPosition
                    if (mLastSelectedPosition == -1)
                        mLastSelectedPosition = mSelectedItemPos
                    else {
                        notifyItemChanged(mLastSelectedPosition)
                        mLastSelectedPosition = mSelectedItemPos
                    }
                    notifyItemChanged(mSelectedItemPos)
                    listener?.selectCity(city)
                }
            }
        }

    }
}