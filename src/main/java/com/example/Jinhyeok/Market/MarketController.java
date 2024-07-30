//package com.example.Jinhyeok.Market;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//public class MarketController {
//
//    @Autowired
//    MarketService marketService;
//
//    @RequestMapping(value = "/price" , method = RequestMethod.GET)
//    public String getRoom(@RequestBody Member member){
//        return marketService.getPrice(member);
//    }
//}
