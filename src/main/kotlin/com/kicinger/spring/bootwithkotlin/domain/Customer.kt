package com.kicinger.spring.bootwithkotlin.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Customer(
        var firstName: String = "",
        var lastName: String = "",

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)