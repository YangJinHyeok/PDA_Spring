package com.example.Jinhyeok.JPA;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Room {
    @Id
    int id;
    String type;
    int price;
}
