package com.example.Jinhyeok.trip.Hotel;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class HotelRepository {
    int id = 0;
//    Map<Integer, String> trip_table = new HashMap<>();
    Map<Integer, Hotel> hotel_table = new HashMap<>();

//    HotelRepository(){
//
//    }

    public String getProduct() {
        return "파라스파라 서울";
    }

//    public String saveProduct(String name) {
//        trip_table.put(id++, name);
//        return trip_table.get(id-1);
//    }
//
    public String searchHotel(int id) {
        Hotel foundHotel = hotel_table.get(id);
        try{
            return foundHotel.getName();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return "exception!!";
        }
//        if(foundHotel != null){
//            return foundHotel.getName();
//        }
//        else{
//            return null;
//        }
//        return hotel_table.get(id).getName();
    }

    public Hotel saveHotel(Hotel hotel) {
        hotel.setId(id);
        hotel_table.put(id++, hotel);
        return hotel_table.get(id-1);
    }
}
