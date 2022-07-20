package com.quadvision.anydel.backend.utils

import java.text.SimpleDateFormat
import java.util.*

object DateTimeUtil {

    const val READABLE_DATE_TIME_FORMAT = "yyyy MMM dd"
    const val SLOT_DATE_TIME_FORMAT = "yyyy-MM-dd"

    fun getDueDateFormattedDate(): String {
        val formatter = SimpleDateFormat(READABLE_DATE_TIME_FORMAT, Locale.ENGLISH)
        val date = Date(System.currentTimeMillis())
        val formattedDate = formatter.format(date)
        return formattedDate
    }


    fun convertTimeStampIntoHourAndMinutes() : String {

        val date = Date(System.currentTimeMillis())
        val formatter = SimpleDateFormat("HH:mma", Locale.ENGLISH)
//        formatter.timeZone = (TimeZone.getTimeZone("UTC"))
        val formattedDate = formatter.format(date)
        return formattedDate
    }
}