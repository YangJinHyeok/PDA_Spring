package com.example.Jinhyeok.trip.User;


import com.example.Jinhyeok.trip.Hotel.Hotel;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    int id = 0;
    Map<Integer, User> user_table = new HashMap<>();

    public String saveUser(User user) {
        user.setId(id);
        user_table.put(id++, user);
        return user_table.get(id-1).getUsername();
    }

    public User loginUser(User user) {
        for (User userTable : user_table.values()) {
            if (userTable.getUsername().equals(user.getUsername()) && userTable.getPassword().equals(user.getPassword())) {
                return userTable;
            }
        }
        return null;
    }
}
