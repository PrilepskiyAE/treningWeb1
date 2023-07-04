package com.prilepskiy.treningWeb1.data.model

import com.prilepskiy.treningWeb1.domain.model.MerchantModel
import com.prilepskiy.treningWeb1.domain.model.OfferModel
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
    ){
    companion object{
        fun from(data: OfferModel):OfferEntity{
            val merchants:MutableList<MerchantEntity> = listOf()

            data.merchant_id.forEach {
                merchants.add(MerchantEntity.from(it))
            }

            return  OfferEntity(data.id,data.name,data.price,merchants)
        }
    }
}
