package com.prilepskiy.treningWeb1.domain.usecases

import com.prilepskiy.treningWeb1.domain.interactors.GetOfferListUseCase
import com.prilepskiy.treningWeb1.domain.model.MerchantModel
import com.prilepskiy.treningWeb1.domain.model.OfferModel
import com.prilepskiy.treningWeb1.domain.repository.OfferRepository
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.stereotype.Component

@Component
class GetOfferListUseCaseImpl(private val repo: OfferRepository): GetOfferListUseCase {
    override fun invoke(): List<OfferModel> {
        val resultTable=repo.findAll()
        val result:MutableList<OfferModel> = listOf()
        resultTable.forEach {
            result.add(OfferModel.from(it))
        }
        return result
    }
    }
