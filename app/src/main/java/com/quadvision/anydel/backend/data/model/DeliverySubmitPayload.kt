package com.quadvision.anydel.backend.data.model

import DropAddr
import PicList
import PickAddr
import com.google.gson.annotations.SerializedName

class DeliverySubmitPayload {

    @SerializedName("mobileNo") var mobileNo : String? = null
    @SerializedName("pickAddr") var pickAddr : PickAddr? = null
    @SerializedName("dropAddr") var dropAddr : DropAddr ? = null
    @SerializedName("receiverName") var receiverName : String ? = null
    @SerializedName("pickContactNo") var pickContactNo : String ? = null
    @SerializedName("dropContactNo") var dropContactNo : String ? = null
    @SerializedName("BookDate") var bookDate : String ? = null
    @SerializedName("BookTime") var bookTime : String ? = null
    @SerializedName("DeliveryDate") var deliveryDate : String ? = null
    @SerializedName("DeliveryTime") var deliveryTime : String ? = null
    @SerializedName("packType") var packType : String ? = null
    @SerializedName("packDescription") var packDescription : String ? = null
    @SerializedName("PaymentMode") var paymentMode : String ? = null
    @SerializedName("packWeight") var packWeight : Int ? = null
    @SerializedName("packLength") var packLength : Int ? = null
    @SerializedName("packBreadth") var packBreadth : Int ? = null
    @SerializedName("packHeight") var packHeight : Int ? = null
    @SerializedName("delDistance") var delDistance : Int ? = null
    @SerializedName("delcharges") var delcharges : Double ? = null
    @SerializedName("purchaseamt") var purchaseamt : Double ? = null
    @SerializedName("discountamt") var discountamt : Int ? = null
    @SerializedName("offerCode") var offerCode : Int ? = null
    @SerializedName("custComment") var custComment : String ? = null
    @SerializedName("PicList") var picList : ArrayList<PicList> ? = null


}
