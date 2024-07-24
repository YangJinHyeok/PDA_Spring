package com.example.Jinhyeok.trip.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;


    public String getRoom(int id) {
        return roomRepository.getRoom(id);
    }
}
