package com.prilepskiy.treningWeb1.domain.interactors


import com.prilepskiy.treningWeb1.domain.model.MerchantModel
//подумаю как иньекнуть
interface AddMerchantUseCase {
    operator fun invoke(merchant: MerchantModel)

}