//package com.example.Jinhyeok.trip.Hotel;
//
//
//import com.example.Jinhyeok.trip.Room.Room;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@ResponseBody
//public class HotelController {
//
//    HotelService hotelService;
//
//    @Autowired
//    HotelController(HotelService hotelService){
//        this.hotelService = hotelService;
//    }
//
//    @RequestMapping(value="/hotels/{id}", method = RequestMethod.GET)
//    public String getEachHotelName(@PathVariable(value = "id") int id){
//        return hotelService.searchHotel(id);
//    }
//
//    @RequestMapping(value="/savehotel", method = RequestMethod.POST)
//    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
//        Hotel savedHotel = hotelService.saveHotel(hotel);
//        if(savedHotel != null){
//            return new ResponseEntity<>(savedHotel, HttpStatus.CREATED);
//        }
//        else{
//            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
//        }
//
//    }
//
//    @RequestMapping(value="/saveroom", method = RequestMethod.POST)
//    public ResponseEntity<Room> saveRoom(@RequestBody Room room){
//        Room savedRoom = hotelService.saveRoom(room);
//        return new ResponseEntity<>(savedRoom, HttpStatus.CREATED);
//    }
//
////    @RequestMapping(value="/saveallroom", method = RequestMethod.POST)
////    public ResponseEntity<List<Room>> saveAllRoom(@RequestBody List<Room> room){
////        List<Room> savedAllRoom = hotelService.saveAllRoom(room);
////        return new ResponseEntity<>(savedAllRoom, HttpStatus.CREATED);
////    }
//}