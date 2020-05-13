package com.tylerthrailkill.services.room.roomservices

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value= ["/rooms"])
@Api(value = "rooms", description = "Data service operations on rooms", tags = ["rooms"])
class RoomController(val roomRepository: RoomRepository){
    @GetMapping
    @ApiOperation(value = "Get all rooms", notes = "get all rooms in the system", nickname = "get rooms")
    fun findAll(@RequestParam roomNumber: String?): List<Room> {
        if (!roomNumber.isNullOrEmpty()) {
            return listOf(this.roomRepository.findByRoomNumber(roomNumber))
        }
        return this.roomRepository.findAll() as List<Room>
    }
}
