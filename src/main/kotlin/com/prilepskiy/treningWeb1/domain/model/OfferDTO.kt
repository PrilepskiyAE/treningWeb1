package com.prilepskiy.treningWeb1.domain.model

import com.fasterxml.jackson.annotation.JsonProperty


data class OfferDTO(
    val id:Int,
    val name:String,
    val price:String,
    @JsonProperty("merchant_Id")
    val merchantId:List<Int>)

