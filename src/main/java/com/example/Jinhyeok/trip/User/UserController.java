package com.example.Jinhyeok.trip.User;


import com.example.Jinhyeok.trip.Hotel.Hotel;
import com.example.Jinhyeok.trip.Hotel.HotelService;
import com.example.Jinhyeok.trip.Room.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {

    UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public String userSignup(@RequestBody User user){
        return userService.saveUser(user);
    }

    @RequestMapping(value="/signin", method = RequestMethod.POST)
    public ResponseEntity<UserResponseDTO> userSignin(@RequestBody User user){
        User savedUser = userService.loginUser(user);
        UserResponseDTO userResponseDTO = userService.convertToDTO(savedUser);
        return new ResponseEntity<>(userResponseDTO, HttpStatus.CREATED);
    }


}
