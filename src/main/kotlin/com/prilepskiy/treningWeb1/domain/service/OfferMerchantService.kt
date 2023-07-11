package com.prilepskiy.treningWeb1.domain.service

import com.prilepskiy.treningWeb1.data.model.Merchant
import com.prilepskiy.treningWeb1.data.model.Offer
import com.prilepskiy.treningWeb1.domain.model.OfferDTO
import jakarta.annotation.PostConstruct
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class OfferMerchantService(private val offerService: OfferService, private val merchantService: MerchantService) {
    val temp: MutableList<Merchant> = listOf()
    val temp2: MutableList<Merchant> = listOf()
    val temp3: MutableList<Merchant> = listOf()
    val temp4: MutableList<Merchant> = listOf()

    @PostConstruct
    fun initDate() {
        merchantService.findAllEntity().forEach {
            when (it.id) {
                in 1..3 -> temp.add(it)
                in 11..13 -> temp2.add(it)
                in 21..30 -> temp3.add(it)
                in 31..40 -> temp4.add(it)
            }
        }
        initOffer(temp, temp2, temp3, temp4)
    }
    private fun initOffer(vararg merchants: MutableList<Merchant>) {
        var i = 0
        merchants.forEach {
            i= ++i
            save(Offer(i, "offer$i", "$i.48$", it))
        }
    }
    private fun save(offer: Offer): Offer = offerService.save(offer)
    fun findAll(): List<OfferDTO> = offerService.findAll()
}