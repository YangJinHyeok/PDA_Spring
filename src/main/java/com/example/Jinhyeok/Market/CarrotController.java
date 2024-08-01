//package com.example.Jinhyeok.Market;
//
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//public class CarrotController {
//
//    private final int MEMBER = 1;
//    private final CarrotMemberService carrotMemberService;
//    private final CarrotNotMemberService carrotNotMemberService;
//
//    public CarrotController(CarrotMemberService carrotMemberService, CarrotNotMemberService carrotNotMemberService) {
//        this.carrotMemberService = carrotMemberService;
//        this.carrotNotMemberService = carrotNotMemberService;
//    }
//
//    @GetMapping("/carrot/{id}")
//    public int calcDiscountedPrice(@PathVariable int id){
//        if(isMember(id)){
//            return carrotMemberService.calcDiscountedPrice();
//        } else {
//            return carrotNotMemberService.calcDiscountedPrice();
//        }
//    }
//
//    private boolean isMember(int id) {
//        return id == MEMBER;
//    }
//
//}
