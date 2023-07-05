package com.prilepskiy.treningWeb1.data.model


import jakarta.persistence.*

@Entity
data class MerchantEntity(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id:Int,
    val name:String,
    val category:String
)
