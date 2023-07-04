package com.prilepskiy.treningWeb1.domain.usecases

import com.prilepskiy.treningWeb1.data.model.MerchantEntity
import com.prilepskiy.treningWeb1.domain.interactors.AddMerchantUseCase
import com.prilepskiy.treningWeb1.domain.model.MerchantModel
import com.prilepskiy.treningWeb1.domain.repository.MerchantRepository
import org.hibernate.annotations.Comment
import org.springframework.stereotype.Component

@Component
class AddMerchantUseCaseImpl(private val repo: MerchantRepository): AddMerchantUseCase {
    override fun invoke(merchant: MerchantModel) {
        repo.save(MerchantEntity.from(merchant))
    }
}