package com.prilepskiy.treningWeb1.domain.usecases

import com.prilepskiy.treningWeb1.domain.interactors.GetMerchantListUseCase
import com.prilepskiy.treningWeb1.domain.model.MerchantModel
import com.prilepskiy.treningWeb1.domain.repository.MerchantRepository
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.stereotype.Component

@Component
class GetMerchantListUseCaseImpl(private val repo: MerchantRepository): GetMerchantListUseCase {
    override fun invoke(): List<MerchantModel> {
        val resultTable=repo.findAll()
        val result:MutableList<MerchantModel> = listOf()
        resultTable.forEach {
            result.add(MerchantModel.from(it))
        }
        return result
    }
}