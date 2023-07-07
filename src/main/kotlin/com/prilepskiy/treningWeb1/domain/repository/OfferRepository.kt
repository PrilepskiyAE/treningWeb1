package com.prilepskiy.treningWeb1.domain.repository

import com.prilepskiy.treningWeb1.data.model.Offer

import org.springframework.data.repository.CrudRepository

interface OfferRepository: CrudRepository<Offer, Int> {
} //