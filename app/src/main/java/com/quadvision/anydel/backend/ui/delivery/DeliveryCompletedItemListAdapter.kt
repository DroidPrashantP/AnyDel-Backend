package com.quadvision.anydel.backend.ui.delivery

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindColor
import butterknife.BindView
import butterknife.ButterKnife
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.PackageInfo
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.CommonUtility

class DeliveryCompletedItemListAdapter(var context : Context, var listener: DeliveryCompletedListItemListener?) : RecyclerView.Adapter<DeliveryCompletedItemListAdapter.PickAddressItemViewHolder>() {

    private var mDeliveryHistoryList = mutableListOf<PackageInfo>()

    interface DeliveryCompletedListItemListener {
        fun setSelectedPackage(address: PackageInfo?)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PickAddressItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_delivery_completed_item, parent, false)
        return PickAddressItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mDeliveryHistoryList?.size ?: 0
    }

    override fun onBindViewHolder(holder: PickAddressItemViewHolder, position: Int) {
        holder.bind(position)
    }

    fun updatePackageInfoList(addressList: MutableList<PackageInfo>?) {
        addressList?.let {
            mDeliveryHistoryList.clear()
            mDeliveryHistoryList.addAll(it)
            notifyDataSetChanged()
        }
    }

    fun clearList() {
        mDeliveryHistoryList?.let {
            it.clear()
            notifyDataSetChanged()
        }
    }

    inner class PickAddressItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        @BindView(R.id.mainContainer)
        lateinit var mMainContainer: ConstraintLayout

        @BindView(R.id.tv_packageDetailScreen_packageIdValue)
        lateinit var mPackageIdTV: AppCompatTextView

        @BindView(R.id.tv_packageDetailScreen_deliveryDateValue)
        lateinit var mDeliveryDateValueTV: AppCompatTextView

        @BindView(R.id.tv_packageDetailScreen_deliveryTimeValue)
        lateinit var mDeliveryTimeValueTV: AppCompatTextView

        @BindView(R.id.tv_packageDetailScreen_statusValue)
        lateinit var mDeliveryStatusValueTV: AppCompatTextView

        @JvmField
        @BindColor(R.color.text_secondary_color)
        var mDisableColor: Int = 0

        @JvmField
        @BindColor(R.color.text_primary_color)
        var mEnableColor: Int = 0

        init {
            ButterKnife.bind(this, itemView)
        }

        fun bind(position: Int) {
            mDeliveryHistoryList?.let {
                val packageInfo = mDeliveryHistoryList[position]

                packageInfo?.let {
                    mPackageIdTV.text = it.packId
                    mDeliveryStatusValueTV.text = it.packStatus
                    mDeliveryDateValueTV.text = it.DeliveryDate
                    mDeliveryTimeValueTV.text = CommonUtility.getFormattedTime(it.DeliveryTime)

                }

                mMainContainer.setOnClickListener {
                    listener?.setSelectedPackage(packageInfo)
                }
            }
        }
    }

    private fun isDeliveryStatusAfterOnTheWay(packageInfo: PackageInfo?): Boolean {
        var isDisable = false
        packageInfo?.let {
            var trackList = AnyDelConstant.getTrackingStepList()
            var count = -1
            for (trac in trackList) {
                count++
                if (AnyDelConstant.PENDING_STATUS_LIST.contains(packageInfo.packStatus)) {
                    count = 0
                    break
                } else if (AnyDelConstant.PAYMENT_STATUS_LIST.contains(packageInfo.packStatus)) {
                    count = 5
                    break
                } else if (packageInfo.packStatus.contains(trac.stepName)) {
                    break
                }
            }
            if (count > 5) {
                isDisable = true
            }
        }
        return isDisable
    }
}