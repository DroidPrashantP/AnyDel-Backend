package com.quadvision.anydel.backend.ui.delivery

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindColor
import butterknife.BindView
import butterknife.ButterKnife
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.PackageInfo
import com.quadvision.anydel.backend.utils.CommonUtility
import com.quadvision.anydel.backend.utils.hide
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import com.quadvision.anydel.backend.utils.show

class PendingDeliveryItemListAdapter(var context : Context, var listener: PendingDeliveryListItemListener?) : RecyclerView.Adapter<PendingDeliveryItemListAdapter.PickAddressItemViewHolder>() {

    private var mDeliveryHistoryList = mutableListOf<PackageInfo>()

    interface PendingDeliveryListItemListener {
        fun setSelectedPackage(address: PackageInfo?)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PickAddressItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_pending_delivery_item, parent, false)
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

        @BindView(R.id.tv_pendingDeliveryScreen_packageIdValue)
        lateinit var mPackageIdTV: AppCompatTextView

        @BindView(R.id.tv_pendingDeliveryScreen_deliveryDateTimeValue)
        lateinit var mDeliveryDateAndTimeValueTV: AppCompatTextView

        @BindView(R.id.tv_pendingDeliveryScreen_deliveryDateValue)
        lateinit var mNameTv: AppCompatTextView

        @BindView(R.id.tv_pendingDeliveryScreen_deliveryStatusValue)
        lateinit var mDeliveryStatusValueTV: AppCompatTextView

        @BindView(R.id.tv_pendingDeliveryScreen_pendingActionLabel)
        lateinit var mAssignedToLabelTV: AppCompatTextView

        @BindView(R.id.tv_pendingDeliveryScreen_pendingActionValue)
        lateinit var mAssignedToValueTV: AppCompatTextView

        @BindView(R.id.btn_pendingDeliveryScreen_takeAction)
        lateinit var mBtnTakeAction: AppCompatButton

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
                    mDeliveryDateAndTimeValueTV.text = it.DeliveryDate.plus("  At ").plus(CommonUtility.getFormattedTime(it.DeliveryTime))
                    mNameTv.text = if(it.customerName.isNotNullOrEmpty()){
                        it.customerName
                    }else {
                        it.receiverName
                    }

                    mBtnTakeAction.setOnClickListener {

                    }

//                    if (AnyDelConstant.PENDING_STATUS_LIST.contains(packageInfo.packStatus)) {
//                        mBtnTakeAction.visibility = View.VISIBLE
//                        mBtnTakeAction.text = "Notify"
//                    } else if (AnyDelConstant.PAYMENT_STATUS_LIST.contains(packageInfo.packStatus)) {
//                        mBtnTakeAction.visibility = View.VISIBLE
//                        mBtnTakeAction.text = "Take Action"
//                    } else {
                        mBtnTakeAction.visibility = View.GONE
//                    }

                    if(packageInfo.assignedTo.isNotNullOrEmpty()){
                        mAssignedToLabelTV.show()
                        mAssignedToValueTV.show()
                        mAssignedToValueTV.text = packageInfo.assignedTo
                    } else {
                        mAssignedToLabelTV.hide()
                        mAssignedToValueTV.hide()
                    }
                }

                mMainContainer.setOnClickListener {
                    listener?.setSelectedPackage(packageInfo)
                }
            }
        }
    }
}