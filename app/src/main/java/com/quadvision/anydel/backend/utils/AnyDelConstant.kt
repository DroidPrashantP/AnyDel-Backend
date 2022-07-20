package com.quadvision.anydel.backend.utils

import com.quadvision.anydel.backend.data.model.TrackStepItem

object AnyDelConstant {

    const val USER_ROLE_SUPERVISOR = "Supervisor"
    const val USER_ROLE_DELIVERY_BOYS = "Delboy"

    const val Google_Place_API_key  = "AIzaSyAGuif15sGxCpMITTAB144kTe8jRR0vw54"
    const val ABOUT_US_LINK  = "https://anydel.in/pages/AboutUs.html"
    const val TERM_AND_COND_LINK  = "https://anydel.in/pages/TermConditions.pdf"
    const val PRIVACY_LINK  = "https://anydel.in/pages/PrivacyPolicy.pdf"
    const val EMPTY = ""
    const val TYPE_ADDRESS = "Type Address"
    const val MAP = "Map"
    const val MAX_IMAGE_SIZE_TWO_MB = 2 * 1024 * 1024;
    const val RESETPWD = "RESETPWD"
    const val REGISTRATION = "REGISTRATION"
    const val BUNDLE_IMAGE_URL = "image_url"

    // Build Type
    const val BUILD_TYPE_DEBUG = "debug"
    const val BUILD_TYPE_RELEASE = "release"



    const val DRAFT = "DRAFT"
    const val PENDING = "PENDING"
    const val CALCULATION = "CALCULATION"
    const val UPDATE_PURCHASE_AMOUNT = "UPDATE PURCHASED AMOUNT"
    const val CONFIRM_DIMENSION = "CONFIRM DIMENSION"
    const val CONFIRM_PURCHASED_AMOUNT = "CONFIRM PURCHASED AMOUNT"
    const val PREPARING_PACKAGE = "PREPARING PACKAGE"
    const val PAYMENT_PENDING = "PAYMENT PENDING"
    const val ON_THE_WAY = "ON THE WAY"
    const val CASH_COLLECTED = "CASH COLLECTED"
    const val CARD_SWIPED = "CARD SWIPED"
    const val QR_CODE = "QR CODE"
    const val COMPLETE_PAYMENT = "COMPLETE PAYMENT"
    const val PAYMENT_RECEIVED = "PAYMENT RECEIVED"
    const val DELIVERED = "DELIVERED"
    const val DELIVERY_COMPLETED = "DELIVERY COMPLETED"
    const val COMPLETED = "COMPLETED"
    const val REJECTED = "REJECTED"
    const val CANCELLED = "CANCELLED"
    const val DELIVERY_IMAGE_UPLOADING = "Delivery"
    const val SERVICE_IMAGE_UPLOADING = "Service"
    const val PROFILE_IMAGE_UPLOADING = "Profile"

    val PENDING_STATUS_LIST =
        arrayOf(DRAFT, PENDING, CALCULATION, UPDATE_PURCHASE_AMOUNT, CONFIRM_DIMENSION)
    val PAYMENT_STATUS_LIST =
        arrayOf(CASH_COLLECTED, CARD_SWIPED, QR_CODE, COMPLETE_PAYMENT)

    fun getTrackingStepList() : MutableList<TrackStepItem>{
        var mTrackStepList = ArrayList<TrackStepItem>()
        mTrackStepList.add(TrackStepItem(1, PENDING, false))
        mTrackStepList?.add(TrackStepItem(2, CONFIRM_PURCHASED_AMOUNT, false))
        mTrackStepList?.add(TrackStepItem(3, PREPARING_PACKAGE, false))
        mTrackStepList?.add(TrackStepItem(4, PAYMENT_PENDING, false))
        mTrackStepList?.add(TrackStepItem(5, ON_THE_WAY, false))
        mTrackStepList?.add(TrackStepItem(6, PAYMENT_RECEIVED, false))
        mTrackStepList?.add(TrackStepItem(7, DELIVERED, false))
//        mTrackStepList?.add(TrackStepItem(8, COMPLETED, false))
//        mTrackStepList?.add(TrackStepItem(9, REJECTED, false))
//        mTrackStepList?.add(TrackStepItem(10, CANCELLED, false))
        return mTrackStepList
    }

    fun getStatusList(): MutableList<String> {

        return ArrayList<String>().apply {
            add(DRAFT)
            add(PENDING)
            add(CALCULATION)
            add(UPDATE_PURCHASE_AMOUNT)
            add(CONFIRM_DIMENSION)
            add(CONFIRM_PURCHASED_AMOUNT)
            add(PREPARING_PACKAGE)
            add(ON_THE_WAY)
            add(CASH_COLLECTED)
            add(CARD_SWIPED)
            add(QR_CODE)
            add(COMPLETE_PAYMENT)
            add(DELIVERY_COMPLETED)
            add(REJECTED)
            add(CANCELLED)
        }
    }


    fun getDelBoyStatusList(): MutableList<String> {

        return ArrayList<String>().apply {
            add(CALCULATION)
            add(UPDATE_PURCHASE_AMOUNT)
            add(CONFIRM_DIMENSION)
            add(PREPARING_PACKAGE)
            add(ON_THE_WAY)
            add(CASH_COLLECTED)
            add(CARD_SWIPED)
            add(QR_CODE)
            add(COMPLETE_PAYMENT)
            add(DELIVERED)
        }
    }

}