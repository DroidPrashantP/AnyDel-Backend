import com.google.gson.annotations.SerializedName


data class PickAddr (

	@SerializedName("addressId") var addressId : Int,
	@SerializedName("saveAddressFlag") var saveAddressFlag : String
)