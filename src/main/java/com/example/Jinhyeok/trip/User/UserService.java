package com.example.Jinhyeok.trip.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public String saveUser(User user) {
        return userRepository.saveUser(user);
    }

    public User loginUser(User user) {
        return userRepository.loginUser(user);
    }

    public UserResponseDTO convertToDTO(User user) {
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setUsername(user.getUsername());
        userResponseDTO.setNickname(user.getNickname());
        return userResponseDTO;
    }
}
