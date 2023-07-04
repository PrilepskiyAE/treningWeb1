package com.prilepskiy.treningWeb1.data.model

import com.prilepskiy.treningWeb1.domain.model.MerchantModel
import jakarta.persistence.*

@Entity
data class MerchantEntity(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id:Int,
    val name:String,
    val category:String
){
    companion object{
        fun from(data: MerchantModel): MerchantEntity {
            return  MerchantEntity(data.id,data.name,data.category)
        }
    }
}
