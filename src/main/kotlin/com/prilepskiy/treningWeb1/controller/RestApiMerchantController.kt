package com.prilepskiy.treningWeb1.controller


import com.prilepskiy.treningWeb1.domain.model.MerchantDTO
import com.prilepskiy.treningWeb1.domain.service.MerchantService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/merchants")
class RestApiMerchantController(private val service:MerchantService) {
    init {
        service.initDate()
    }

    @GetMapping
    fun getMerchants(): List<MerchantDTO> {
        return service.findAll()
    }
}