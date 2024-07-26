//package com.example.Jinhyeok.trip.Room;
//
//import com.example.Jinhyeok.trip.Exception.RoomNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class RoomController {
//
//    @Autowired
//    private RoomService roomService;
//
//    @PostMapping("/rooms")
//    public void saveRoom(@RequestBody Room room){
//        roomService.saveRoom(room);
//    }
//
////    @RequestMapping(value = "/rooms/{id}" , method = RequestMethod.GET)
////    public Room getRoom(@PathVariable("id") int id){
////        return roomService.getRoom(id);
////    }
//
//    @RequestMapping(value = "/rooms/{id}" , method = RequestMethod.GET)
//    public String getRoom(@PathVariable("id") int id){
//        return roomService.getRoom(id);
//    }
//}
