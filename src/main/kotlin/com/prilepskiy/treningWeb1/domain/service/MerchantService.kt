package com.prilepskiy.treningWeb1.domain.service

import com.prilepskiy.treningWeb1.data.model.Merchant
import com.prilepskiy.treningWeb1.domain.model.MerchantDTO
import com.prilepskiy.treningWeb1.domain.repository.MerchantRepository
import jakarta.annotation.PostConstruct
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class  MerchantService(private val merchantRepository: MerchantRepository) {
  private  fun save(offer: Merchant):Merchant = merchantRepository.save(offer)
  @PostConstruct
    fun initDate()= (1..100).toList().map { save(Merchant(it, "name$it", "category$it")) }
    fun findAll():List<MerchantDTO> = merchantRepository.findAll().map { MerchantDTO(it.id,it.name,it.category) }
    fun findAllEntity():Iterable<Merchant> = merchantRepository.findAll()

}