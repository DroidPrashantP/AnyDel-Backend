import com.google.gson.annotations.SerializedName


data class DropAddr (

	@SerializedName("addressId") var addressId : Int,
	@SerializedName("saveAddressFlag") var saveAddressFlag : String
)