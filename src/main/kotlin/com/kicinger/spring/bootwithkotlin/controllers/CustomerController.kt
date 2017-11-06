package com.kicinger.spring.bootwithkotlin.controllers

import com.kicinger.spring.bootwithkotlin.repositories.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val customerRepository: CustomerRepository) {

    @GetMapping("/")
    fun findAll() = customerRepository.findAll();

    @GetMapping("/{lastName}")
    fun findByLastName(@PathVariable lastName: String) = customerRepository.findByLastName(lastName);

}