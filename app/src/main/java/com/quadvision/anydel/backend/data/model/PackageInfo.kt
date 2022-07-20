package com.quadvision.anydel.backend.data.model

import PicList
import com.google.gson.annotations.SerializedName

data class PackageInfo(
    @SerializedName("BookDate", alternate = ["bookDate"])
    var BookDate: String,
    @SerializedName("BookTime", alternate = ["bookTime"])
    var BookTime: String,
    @SerializedName("DeliveryDate", alternate = ["delDate"])
    var DeliveryDate: String,
    @SerializedName("DeliveryTime", alternate = ["delTime"])
    var DeliveryTime: String,
    var PaymentMode: String,
    var PicList: List<PicList>,
    var custComment: String,
    var delcharges: Double,
    var dropAddr: List<Address>,
    var dropContactNo: String,
    var mobileNo: String,
    var packBreadth: Int,
    @SerializedName("packDescription", alternate = ["packDesc"])
    var packDescription: String,
    var packHeight: Int,
    var packId: String,
    var packLength: Int,
    var packStatus: String,
    var packType: String,
    var packWeight: Int,
    var pickAddr: List<Address>,
    var pickContactNo: String,
    var purchaseamt: Double,
    var receiverName: String,
    var totalamt: Double,
    var assignedTo: String,
    var assignedBy: String,
    var customerName: String

)

