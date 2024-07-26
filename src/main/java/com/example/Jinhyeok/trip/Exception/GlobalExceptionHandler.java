//package com.example.Jinhyeok.trip.Exception;
//
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//
//@Slf4j
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
////    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
//
//    @ExceptionHandler
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public String catchRoomNotFoundException(RoomNotFoundException e){
////        System.out.println(e.getClass());
//        log.error("exception class : {}", e.getClass());
//        return "No Room!";
//    }
//}
