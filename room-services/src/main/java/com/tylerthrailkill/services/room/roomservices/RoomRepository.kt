package com.tylerthrailkill.services.room.roomservices

import org.springframework.data.repository.CrudRepository

interface RoomRepository : CrudRepository<Room, Long> {
    fun findByRoomNumber(roomNumber: String): Room
}
