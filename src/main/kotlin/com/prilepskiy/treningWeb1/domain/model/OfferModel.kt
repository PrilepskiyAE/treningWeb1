package com.prilepskiy.treningWeb1.domain.model

import com.prilepskiy.treningWeb1.data.model.MerchantEntity
import com.prilepskiy.treningWeb1.data.model.OfferEntity
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.hibernate.internal.util.collections.CollectionHelper.setOf


data class OfferModel(
    val id:Int,
    val name:String,
    val price:String,
    val merchant_id:List<MerchantModel>)
    {
        companion object{
        fun from(data: OfferEntity):OfferModel{
            val merchants:MutableList<MerchantModel> = listOf()

            data.merchant_id.forEach {
                merchants.add(MerchantModel.from(it))
            }

            return  OfferModel(data.id,data.name,data.price,merchants)
        }
    }
    }
