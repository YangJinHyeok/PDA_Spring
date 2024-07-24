package com.example.Jinhyeok.trip.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;


    @RequestMapping(value = "/rooms/{id}" , method = RequestMethod.GET)
    public String getRoom(@PathVariable("id") int id){
        return roomService.getRoom(id);
    }
}
