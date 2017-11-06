package com.kicinger.spring.bootwithkotlin.repositories

import com.kicinger.spring.bootwithkotlin.domain.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {

    fun findByLastName(lastName: String) : List<Customer>;

}