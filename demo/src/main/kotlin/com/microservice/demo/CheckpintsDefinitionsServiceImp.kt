package com.microservice.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
@Service
class CheckpintsDefinitionsServiceImp {
    @Autowired
    lateinit var checkpintsDefinitionsRepository: CheckpintsDefinitionsServiceImp

    override fun getOrder(id: Int)=checkpintsDefinitionsRepository.findById(id)
    override fun createOrder(checkpintsDefinitions: Mono<CheckpintsDefinitions>) = checkpintsDefinitionsRepository.create(checkpintsDefinitions)
}