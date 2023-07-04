package com.prilepskiy.treningWeb1.domain.model

import com.prilepskiy.treningWeb1.data.model.MerchantEntity
import org.hibernate.property.access.internal.PropertyAccessStrategyEnhancedImpl.with


data class MerchantModel (
    val id:Int,
    val name:String,
    val category:String
){
    companion object{
        fun from(data: MerchantEntity):MerchantModel{
          return  MerchantModel(data.id,data.name,data.category)
        }
    }
}