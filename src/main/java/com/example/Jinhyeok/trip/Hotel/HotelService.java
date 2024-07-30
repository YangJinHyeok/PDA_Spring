//package com.example.Jinhyeok.trip.Hotel;
//
//import com.example.Jinhyeok.trip.Room.Room;
//import com.example.Jinhyeok.trip.Room.RoomJPARepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class HotelService {
//    private final RoomJPARepository roomRepository;
//    HotelRepository hotelRepository;
//
//    @Autowired
//    HotelService(HotelRepository hotelRepository, RoomJPARepository roomRepository){
//        this.hotelRepository = hotelRepository;
//        this.roomRepository = roomRepository;
//    }
//
//    public String getProduct() {
//        return hotelRepository.getProduct();
//    }
//
////    public String addProduct(String name) {
////        return hotelRepository.saveProduct(name) + " 상품 생성하였습니다.";
////    }
//
//    public String searchHotel(int id) {
//        return hotelRepository.searchHotel(id) + "를 찾았습니다.";
//    }
//
//    public Hotel saveHotel(Hotel hotel) {
//        return hotelRepository.saveHotel(hotel);
//    }
//
//    public Room saveRoom(Room room) {
//        return roomRepository.saveRoom(room);
//    }
//
////    public List<Room> saveAllRoom(List<Room> room) {
////        for(Room eachRoom : room){
////            roomRepository.saveRoom(eachRoom);
////        }
////    }
//}
