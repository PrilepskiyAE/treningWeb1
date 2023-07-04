package com.prilepskiy.treningWeb1.controller

import com.prilepskiy.treningWeb1.domain.interactors.AddMerchantUseCase
import com.prilepskiy.treningWeb1.domain.interactors.AddOfferUseCase
import com.prilepskiy.treningWeb1.domain.interactors.GetMerchantListUseCase
import com.prilepskiy.treningWeb1.domain.interactors.GetOfferListUseCase
import com.prilepskiy.treningWeb1.domain.model.MerchantModel
import com.prilepskiy.treningWeb1.domain.model.OfferModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/offers")
class RestApiOfferController(private val addOfferUseCase: AddOfferUseCase, private val getOfferListUseCase: GetOfferListUseCase) {
    init {

//Добавлю изначальную инициализацию
    }

    @GetMapping
    fun getOffers(): List<OfferModel> {
        return getOfferListUseCase()
    }
}