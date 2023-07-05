package com.prilepskiy.treningWeb1.domain.usecases

import com.prilepskiy.treningWeb1.data.model.MerchantEntity
import com.prilepskiy.treningWeb1.data.model.OfferEntity
import com.prilepskiy.treningWeb1.domain.interactors.AddOfferUseCase
import com.prilepskiy.treningWeb1.domain.model.OfferModel

import com.prilepskiy.treningWeb1.domain.repository.OfferRepository
import org.springframework.stereotype.Component

@Component
class AddOfferUseCaseImpl(private val repo: OfferRepository): AddOfferUseCase {
    override fun invoke(offer: OfferModel) {
        repo.save(OfferEntity.from(offer))
    }
}