package com.prilepskiy.treningWeb1.domain.interactors


import com.prilepskiy.treningWeb1.domain.model.OfferModel

interface AddOfferUseCase {
    operator fun invoke(merchant: OfferModel)
}