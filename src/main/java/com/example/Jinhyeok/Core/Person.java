package com.example.Jinhyeok.Core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    House house;

    @Autowired
    public Person(House house){
        this.house = house;
        System.out.println(house.getName() + "집을 샀습니다.");
    }
}
