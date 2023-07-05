package com.prilepskiy.treningWeb1.domain.model


data class OfferDTO(
    val id:Int,
    val name:String,
    val price:String,
    val merchant_id:List<Int>)

