package com.quadvision.anydel.backend.data.model

import DropAddr
import PicList
import PickAddr
import com.quadvision.anydel.backend.utils.CommonUtility
import com.quadvision.anydel.backend.utils.appendZeroToMobileNumber
import com.quadvision.anydel.backend.utils.getTimeFormat
import com.quadvision.anydel.backend.utils.strToInt

object DeliveryPayload {
    private var mDeliverySubmitPayload: DeliverySubmitPayload? = null

    fun getInstance(): DeliverySubmitPayload? {
        if (mDeliverySubmitPayload == null) {
            mDeliverySubmitPayload = DeliverySubmitPayload()
        }
        return mDeliverySubmitPayload
    }

    fun submitAddressInfo(
        pickAddress: Address,
        dropAddress: Address,
        pickAddressMobileNo: String,
        dropAddressMobileNo: String
    ) {
        getInstance()?.let {
            it.pickAddr = PickAddr(pickAddress.addressId.strToInt(), pickAddress.isdefault)
            it.dropAddr = DropAddr(dropAddress.addressId.strToInt(), dropAddress.isdefault)

            it.pickContactNo = pickAddressMobileNo.appendZeroToMobileNumber()
            it.dropContactNo = dropAddressMobileNo.appendZeroToMobileNumber()

            // Save mobile number
            var userMobileNumber = CommonUtility.getUserMobileData()
            if (userMobileNumber.isNullOrEmpty()) {
                userMobileNumber = CommonUtility.getUserData()?.mobileNo
            }
            it.mobileNo = userMobileNumber?.appendZeroToMobileNumber()

        }
    }

    fun submitPackageInfo(
        packType: String,
        packDescription: String,
        customerComment: String,
        mAttachedImagesList: ArrayList<PicList>?,
        packageWeightField: String,
        packageLengthField: String,
        packageBreadthField: String,
        packageHeightField: String,
    ) {
        getInstance()?.let {
            it.packType = packType
            it.packDescription = packDescription
            it.custComment = customerComment

            mAttachedImagesList?.let { pickList ->
                it.picList = pickList

            }
            it.custComment = customerComment
            it.packWeight = packageWeightField.strToInt()
            it.packLength = packageLengthField.strToInt()
            it.packBreadth = packageBreadthField.strToInt()
            it.packHeight = packageHeightField.strToInt()
        }
    }

    fun submitSlotAndPaymentInfo(
        bookDate: String,
        bookTime: String,
        deliveryDate: String,
        deliveryTime: String,
        paymentMode: String,
        deliveryCharges: Double
    ) {
        getInstance()?.let {
            it.bookDate = bookDate.replace(" ", "-").toUpperCase()
            it.bookTime = bookTime.getTimeFormat()
            it.deliveryDate = deliveryDate.replace(" ", "-").toUpperCase()
            it.deliveryTime = deliveryTime.getTimeFormat()
            it.paymentMode = paymentMode
            it.delcharges = deliveryCharges
            it.purchaseamt = deliveryCharges

            // Save mobile number
            val userData = CommonUtility.getUserData()
            if (userData!= null) {
                it.receiverName = CommonUtility.getUserData()?.firstName
            }
        }
    }

}