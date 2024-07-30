//package com.example.Jinhyeok.JPA;
//
//import jakarta.persistence.EntityManager;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Repository
//public class RoomJPARepository implements RoomRepository{
//
//    EntityManager entityManager;
//
//    public RoomJPARepository(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    int id = 0;
//    Map<Integer, Room> room_table = new HashMap<>();
//
//    public void saveRoom(Room room) {
//        entityManager.persist(room);
//    }
//
//    public Room getRoom(int id) {
//        return entityManager.find(Room.class, id);
//    }
//
//    @Override
//    public Room save() {
//        return null;
//    }
//}