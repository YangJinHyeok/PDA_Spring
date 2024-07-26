package com.example.Jinhyeok.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/rooms")
    public void saveRoom(@RequestBody Room room){
        roomService.saveRoom(room);
    }
}

