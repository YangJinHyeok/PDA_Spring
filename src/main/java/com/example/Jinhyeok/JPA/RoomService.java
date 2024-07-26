package com.example.Jinhyeok.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Transactional
    public void saveRoom(Room room) {
        roomRepository.saveRoom(room);
    }


}
