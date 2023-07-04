package com.prilepskiy.treningWeb1.domain.interactors

import com.prilepskiy.treningWeb1.domain.model.MerchantModel
import com.prilepskiy.treningWeb1.domain.model.OfferModel

interface GetMerchantListUseCase {
    operator fun invoke():List<MerchantModel>
}