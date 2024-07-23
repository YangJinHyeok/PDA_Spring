package com.example.Jinhyeok.trip.Room;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RoomRepository {
    int id =0;
    Map<Integer, Room> room_table = new HashMap<>();


    public Room saveRoom(Room room) {
//        room.setId(id);
        room_table.put(id++, room);
        return room_table.get(id-1);
    }
}
