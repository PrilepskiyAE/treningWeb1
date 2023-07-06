package com.prilepskiy.treningWeb1.domain.service

import com.prilepskiy.treningWeb1.data.model.MerchantEntity
import com.prilepskiy.treningWeb1.data.model.OfferEntity
import com.prilepskiy.treningWeb1.domain.model.OfferDTO
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.stereotype.Service

@Service
class OfferMerchantService(private val offerService: OfferService ,private val merchantService: MerchantService) {
        fun initDate(){
        val temp:MutableList<MerchantEntity> = listOf()
        val temp2:MutableList<MerchantEntity> = listOf()
         val temp3:MutableList<MerchantEntity> = listOf()
        val temp4:MutableList<MerchantEntity> = listOf()
             merchantService.findAllEntity().forEach {


            when(it.id){
                in  1..3->{
                    temp.add(it)
                }
                in 11..13->{
                    temp2.add(it)
                }
                in 21..30->{
                    temp3.add(it)
                }

                in 31..40->{
                    temp4.add(it)
                }
                else -> {

                }

            }

        }
        save(OfferEntity(1,"offer1","2.48$",temp))
        save(OfferEntity(2,"offer2","3.48$",temp2))
        save(OfferEntity(3,"offer3","4.48$",temp3))
        save(OfferEntity(4,"offer4","5.48$",temp4))


    }
        private fun save(offer: OfferEntity){
            offerService.save(offer)
        }
    fun findAll():List<OfferDTO>{
        return offerService.findAll()
    }
}