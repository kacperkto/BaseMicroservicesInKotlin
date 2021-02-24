package com.microservice.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GettingConfiguration {

    @Value("\${microservice.example.demo}")
    private lateinit var greetings: String

    @GetMapping("/gree")
    fun getSettings() = greetings
}