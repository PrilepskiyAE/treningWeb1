package com.prilepskiy.treningWeb1.controller



import com.prilepskiy.treningWeb1.domain.model.OfferDTO
import com.prilepskiy.treningWeb1.domain.service.MerchantService
import com.prilepskiy.treningWeb1.domain.service.OfferService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/offers")
class RestApiOfferController(private val service: OfferService) {
init {
    service.initDate()
}
    @GetMapping
    fun getOffers(): List<OfferDTO> {
        return service.findAll()
    }
}