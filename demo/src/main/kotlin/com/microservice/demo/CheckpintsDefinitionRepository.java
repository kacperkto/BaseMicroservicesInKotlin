package com.microservice.demo

import org.springframework.data.jpa.repository.Query
import reactor.core.publisher.Mono
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;


@Repository
interface CheckpintsDefinitionRepository  {

    getOrders(id: Int): List<Mono<CheckpintsDefinitions>>;
    }

