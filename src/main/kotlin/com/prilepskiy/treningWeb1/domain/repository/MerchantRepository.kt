package com.prilepskiy.treningWeb1.domain.repository

import com.prilepskiy.treningWeb1.data.model.Merchant
import org.springframework.data.repository.CrudRepository

interface MerchantRepository:  CrudRepository<Merchant,Int> {
 }