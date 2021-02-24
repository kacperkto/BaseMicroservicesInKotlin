package com.microservice.demo
import org.springframework.data.jpa.repository.Query
import reactor.core.publisher.Mono
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository


interface CheckpintsDefinitionsSrveice  {
    fun getOrder(): Mono<CheckpintsDefinitions>
     fun createOrder()  :Mono<CheckpintsDefinitions>
}