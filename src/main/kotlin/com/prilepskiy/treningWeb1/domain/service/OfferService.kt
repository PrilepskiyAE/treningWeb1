package com.prilepskiy.treningWeb1.domain.service

import com.prilepskiy.treningWeb1.data.model.MerchantEntity
import com.prilepskiy.treningWeb1.data.model.OfferEntity
import com.prilepskiy.treningWeb1.domain.model.MerchantDTO
import com.prilepskiy.treningWeb1.domain.model.OfferDTO
import com.prilepskiy.treningWeb1.domain.repository.MerchantRepository
import com.prilepskiy.treningWeb1.domain.repository.OfferRepository
import org.hibernate.internal.util.collections.CollectionHelper
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.stereotype.Service

@Service
class OfferService(private val repo:OfferRepository) {
    fun save(offer: OfferEntity) {
        repo.save(offer)
    }



    fun findAll():List<OfferDTO>{
        val result:MutableList<OfferDTO> = listOf()


        repo.findAll().forEach { offer->
        val merchantId:MutableList<Int> = listOf()
            offer.merchant_id.forEach { merchant->
               merchantId.add(merchant.id)
            }

         result.add(OfferDTO(offer.id,offer.name,offer.price,merchantId))
        }



        return result
    }
}