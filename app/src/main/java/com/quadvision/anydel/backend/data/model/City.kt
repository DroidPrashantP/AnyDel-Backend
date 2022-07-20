package com.quadvision.anydel.backend.data.model

data class City(var pin : String, var name: String, var supervisors : List<UserType>, var deliveryboys : List<UserType>,)
