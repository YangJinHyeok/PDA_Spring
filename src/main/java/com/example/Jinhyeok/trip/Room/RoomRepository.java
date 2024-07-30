//package com.example.Jinhyeok.trip.Room;
//
//import com.example.Jinhyeok.trip.Exception.RoomNotFoundException;
//import jakarta.persistence.EntityManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.datasource.DataSourceUtils;
//import org.springframework.stereotype.Repository;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//import java.util.Map;
//
//@Repository
//public class RoomJPARepository {
//
//    EntityManager entityManager;
//
//    public RoomJPARepository(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//    int id =0;
//    Map<Integer, Room> room_table = new HashMap<>();
//
//
//
////    public Room getRoom(int id){
////        Room foundRoom = room_table.get(id);
////
////        try {
////            if (foundRoom != null)
////                return foundRoom;
////            else
////                throw new NoSuchElementException("no room!");
////        } catch (NoSuchElementException e){
////            return new Room();
////        }
//////        try{
//////            return room_table.get(id).getType();
//////        } catch (Exception e){
//////            System.out.println("hi");
//////            return "exception!!";
//////        }
////    }
//
//
//    public String getRoom(int id){
//        Room foundRoom = room_table.get(id);
//
//
//        if (foundRoom != null)
//            return foundRoom.getType();
//        else
//            throw new RoomNotFoundException("no room!");
//    //        try{
//    //            return room_table.get(id).getType();
//    //        } catch (Exception e){
//    //            System.out.println("hi");
//    //            return "exception!!";
//    //        }
//    }
//
////    public void svaeRoom(){
////        entityManager.persist(객체);
////    }
//
//    public void saveRoom(Room room){
//        entityManager.persist(room);
//    }
//
////    public Room saveRoom(Room room) {
//////        room.setId(id);
////        room_table.put(id++, room);
////        return room_table.get(id-1);
////    }
//}
