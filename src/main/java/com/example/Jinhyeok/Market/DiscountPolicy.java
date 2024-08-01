//package com.example.Jinhyeok.Market;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//
///**
// * Service에서 타입 역할을 해줄 껍데기
// */
//
//
//public interface DiscountPolicy {
//    int getJohang();
//}
//
//@Qualifier("discountMemberPolicy")
//@Component
//class DiscountMemberPolicy implements DiscountPolicy{
//
//    public int getJohang() {
//        return 1;
//    }
//}
//
//@Primary
//@Component
//class DiscountNotMemberPolicy implements DiscountPolicy{
//
//    public int getJohang() {
//        return 0;
//    }
//}
//
