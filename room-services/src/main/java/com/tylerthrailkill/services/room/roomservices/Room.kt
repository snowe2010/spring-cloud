package com.tylerthrailkill.services.room.roomservices

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "ROOM")
class Room(
    @Id @Column(name = "ROOM_ID") @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    
    @Column(name = "NAME")
    val name: String? = null,

    @Column(name = "ROOM_NUMBER")
    val roomNumber: String? = null,
    
    @Column(name = "BED_INFO")
    val bedInfo: String? = null
)

