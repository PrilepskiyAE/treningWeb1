package com.prilepskiy.treningWeb1.data.model


import jakarta.persistence.*
import org.hibernate.internal.util.collections.CollectionHelper
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.hibernate.internal.util.collections.CollectionHelper.setOf

@Entity
data class OfferEntity(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id:Int,
    val name:String,
    val price:String,
    @OneToMany
    val merchant_id:List<MerchantEntity>
    )
