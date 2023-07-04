package com.prilepskiy.treningWeb1.domain.interactors

import com.prilepskiy.treningWeb1.domain.model.OfferModel

interface GetOfferListUseCase {
    operator fun invoke():List<OfferModel>
}