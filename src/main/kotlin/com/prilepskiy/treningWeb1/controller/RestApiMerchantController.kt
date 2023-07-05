package com.prilepskiy.treningWeb1.controller

import com.prilepskiy.treningWeb1.domain.interactors.AddMerchantUseCase
import com.prilepskiy.treningWeb1.domain.interactors.GetMerchantListUseCase
import com.prilepskiy.treningWeb1.domain.model.MerchantModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/merchants")
class RestApiMerchantController(private val addMerchantUseCase: AddMerchantUseCase,private val getMerchantListUseCase: GetMerchantListUseCase) {
    init {

        for (i in 1..  100) {
            addMerchantUseCase(MerchantModel(i, "name$i", "category$i"))
        }

    }

    @GetMapping
    fun getMerchants(): List<MerchantModel> {
        return getMerchantListUseCase()
    }
}