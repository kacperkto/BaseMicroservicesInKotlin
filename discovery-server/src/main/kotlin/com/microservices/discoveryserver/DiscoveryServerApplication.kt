package com.microservices.discoveryserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.core.annotation.Order

@SpringBootApplication
@EnableEurekaServer
class DiscoveryServerApplication

fun main(args: Array<String>) {
	runApplication<DiscoveryServerApplication>(*args)
}
