package com.prilepskiy.treningWeb1.domain.repository

import com.prilepskiy.treningWeb1.data.model.OfferEntity
import com.prilepskiy.treningWeb1.domain.model.OfferModel
import org.springframework.data.repository.CrudRepository

interface OfferRepository: CrudRepository<OfferEntity, Int> {
}