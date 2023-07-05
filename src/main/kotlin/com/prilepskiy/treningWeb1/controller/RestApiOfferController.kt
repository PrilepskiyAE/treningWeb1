package com.prilepskiy.treningWeb1.controller

import com.prilepskiy.treningWeb1.domain.interactors.AddMerchantUseCase
import com.prilepskiy.treningWeb1.domain.interactors.AddOfferUseCase
import com.prilepskiy.treningWeb1.domain.interactors.GetMerchantListUseCase
import com.prilepskiy.treningWeb1.domain.interactors.GetOfferListUseCase
import com.prilepskiy.treningWeb1.domain.model.MerchantModel
import com.prilepskiy.treningWeb1.domain.model.OfferModel
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/offers")
class RestApiOfferController(private val addOfferUseCase: AddOfferUseCase, private val getOfferListUseCase: GetOfferListUseCase,getMerchantListUseCase: GetMerchantListUseCase) {
    init {
        val temp:MutableList<MerchantModel> = listOf()
        val temp2:MutableList<MerchantModel> = listOf()
        val temp3:MutableList<MerchantModel> = listOf()
        val temp4:MutableList<MerchantModel> = listOf()
        getMerchantListUseCase().forEach {


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
        addOfferUseCase(OfferModel(1,"offer1","2.48$",temp))
        addOfferUseCase(OfferModel(2,"offer2","3.48$",temp2))
        addOfferUseCase(OfferModel(3,"offer3","4.48$",temp3))
        addOfferUseCase(OfferModel(4,"offer4","5.48$",temp4))

    }

    @GetMapping
    fun getOffers(): List<OfferModel> {
        return getOfferListUseCase()
    }
}