//package com.example.Jinhyeok.Ocp;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class OcpService {
//
//    @Autowired
//    OcpRepository ocpRepository;
//
////    public OcpService(OcpRepository ocpRepository) {
////        this.ocpRepository = ocpRepository;
////    }
//
//    public void callMethod1(){
//        ocpRepository.method1();
//    }
//
//    public void callMethod2(){
//        ocpRepository.method2();
//    }
//
//    /**
//     * OcpARepository를 쓰다가
//     * OcpBRepository로 바꾸고 싶음
//     * (두 Repository가 같은 기능을 한다
//     *
//     * void method1() : "OcpAmethod1" "OcpBmethod1"
//     * void method2() : "OcpAmethod2" "OcpBmethod2"
//     *
//     * => OcpService의 코드는 변경되지 않고
//     *    OcpRepository들을 바꿔서 쓸 수 있게
//     */
//
//
//}
