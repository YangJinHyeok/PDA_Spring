package com.example.Jinhyeok.JPA;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Repository
public class RoomRepository {

    EntityManager entityManager;

    public RoomRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    int id = 0;
    Map<Integer, Room> room_table = new HashMap<>();

    public void saveRoom(Room room) {
        entityManager.persist(room);
    }
}