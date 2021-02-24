package com.microservice.demo


import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.ServerResponse.*
import org.springframework.web.reactive.function.server.bodyToMono
import reactor.core.publisher.onErrorResume
import java.net.URI

@Component
class CheckpintsDefinitionsHandler(val orderService: CheckpintsDefinitionsService) {

    fun get(serverRequest: ServerRequest) = orderService.getOrder(serverRequest.pathVariable("id").toInt())
            .flatMap {order->ok().body(fromObject(order)) }
            .switchIfEmpty(status(HttpStatus.URI_TOO_LONG).build())
    fun create(serverRequest: ServerRequest)=orderService.createOrder(serverRequest.bodyToMono()).flatMap {
        created(URI.create("/order/${it.id}")).build().onErrorResume(Exception::class) {
            badRequest().body(fromObject("error"))
        }

    }
}