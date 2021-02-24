package com.microservice.demo

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.router

@Component
class CheckpintsDefinitionsRouter(private val checkpintsDefinitionsHandler: CheckpintsDefinitionsHandler){
    @Bean
    fun orderRouters()= router{
        "/orders".nest {
            GET("/{id}",checkpintsDefinitionsHandler::get)
            POST("/", checkpintsDefinitionsHandler::create)
        }

    }
}