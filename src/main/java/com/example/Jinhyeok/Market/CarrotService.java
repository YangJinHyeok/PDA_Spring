//package com.example.Jinhyeok.Market;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//
//public class CarrotService {
//
//    DiscountPolicy discountPolicy;
//
//    public CarrotService(DiscountPolicy discountPolicy) {
//        this.discountPolicy = discountPolicy;
//    }
//
//    public int calcDiscountedPrice() {
//        return discountPolicy.getJohang();
//    }
//}
//
//@Component
//class CarrotMemberService extends CarrotService{
//
//    public CarrotMemberService(@Qualifier("discountMemberPolicy") DiscountPolicy discountPolicy) {
//        super(discountPolicy);
//    }
//}
//@Component
//class CarrotNotMemberService extends CarrotService{
//
//
//    public CarrotNotMemberService(DiscountPolicy discountPolicy) {
//        super(discountPolicy);
//    }
//}
