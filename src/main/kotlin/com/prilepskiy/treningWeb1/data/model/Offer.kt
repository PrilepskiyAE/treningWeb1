package com.prilepskiy.treningWeb1.data.model
import jakarta.persistence.*

@Entity
data class Offer(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id:Int,
    val name:String,
    val price:String,
    @OneToMany
    @Column(name = "merchant_id")
    val merchantId:List<Merchant>
    )
