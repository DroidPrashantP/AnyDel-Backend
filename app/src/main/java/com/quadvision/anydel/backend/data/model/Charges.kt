package com.quadvision.anydel.backend.data.model

data class Charges(
    val basicDelAmt: Double,
    val basicKm: String,
    val discountAmt: Double,
    val extraDelAmt: Double,
    val extraKm: String,
    val finalDelAmt: Double,
    val tax: Double,
    val totalKm: String
)