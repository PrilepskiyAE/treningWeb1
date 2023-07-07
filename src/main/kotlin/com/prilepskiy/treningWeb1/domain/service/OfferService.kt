package com.prilepskiy.treningWeb1.domain.service

import com.prilepskiy.treningWeb1.data.model.Offer
import com.prilepskiy.treningWeb1.domain.model.OfferDTO
import com.prilepskiy.treningWeb1.domain.repository.OfferRepository
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.stereotype.Service

@Service
class OfferService(private val offerRepository:OfferRepository) {
    fun save(offer: Offer):Offer = offerRepository.save(offer)
    fun findAll():List<OfferDTO>{
        val result:MutableList<OfferDTO> = listOf()
        offerRepository.findAll().forEach { offer->
        val merchantId:MutableList<Int> = listOf()
            offer.merchantId.forEach { merchant->
               merchantId.add(merchant.id)
            }
         result.add(OfferDTO(offer.id,offer.name,offer.price,merchantId))
        }
        return result
    }
}