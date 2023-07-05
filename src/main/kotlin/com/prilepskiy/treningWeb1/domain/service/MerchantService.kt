package com.prilepskiy.treningWeb1.domain.service

import com.prilepskiy.treningWeb1.data.model.MerchantEntity
import com.prilepskiy.treningWeb1.data.model.OfferEntity
import com.prilepskiy.treningWeb1.domain.model.MerchantDTO
import com.prilepskiy.treningWeb1.domain.repository.MerchantRepository
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.stereotype.Service

@Service
class MerchantService(private val repo: MerchantRepository) {
  private  fun save(offer: MerchantEntity) {
        repo.save(offer)
    }

    fun initDate(){
        for (i in 1..  100) {
            save(MerchantEntity(i, "name$i", "category$i"))
        }
    }

    fun findAll():List<MerchantDTO>{
        val result:MutableList<MerchantDTO> = listOf()
        repo.findAll().forEach {
            result.add(MerchantDTO(it.id,it.name,it.category))
        }

        return result
    }

    fun findAllEntity():Iterable<MerchantEntity>{

        return repo.findAll()
    }
}