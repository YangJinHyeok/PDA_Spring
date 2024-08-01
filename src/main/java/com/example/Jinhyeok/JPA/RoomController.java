//package com.example.Jinhyeok.JPA;
//
//import com.example.Jinhyeok.JPA.Dto.RoomRegisterReq;
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
//    public void saveRoom(@RequestBody RoomRegisterReq roomRegisterReq){
//        roomService.saveRoom(roomRegisterReq);
//    }
//
////    @GetMapping("/room")
////    public void addroom(){
////        System.out.println("aaaa");
////    }
//
////    @GetMapping("/findroom/{id}")
////    public Room getRoom(@PathVariable int id){
////        return roomService.getRoom(id);
////    }
//}
//
