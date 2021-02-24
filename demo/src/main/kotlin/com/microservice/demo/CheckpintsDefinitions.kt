package com.microservice.demo

import javax.persistence.*

@Entity
@Table(name="CHECKPOINT_DEFININTIONS")
data class CheckpintsDefinitions(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id :Int,

        @Column(name = "checkpoint")
        var checkpoint :String,

        @Column(name = "camera_definitionId")
        val camera_definitionId:Int

)