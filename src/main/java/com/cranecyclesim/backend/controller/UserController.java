package com.cranecyclesim.backend.controller;

import com.cranecyclesim.backend.dto.UserDto;
import com.cranecyclesim.backend.jpa.entity.User;
import com.cranecyclesim.backend.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    @RequestMapping(path="/users", method= RequestMethod.GET)
    public ResponseEntity<List<User>> getUserList(){
        return new ResponseEntity<>(userService.getUserList(), HttpStatus.OK);
    }

    @RequestMapping(path="/user", method=RequestMethod.POST)
    public ResponseEntity<User> createUser(UserDto userDto){
        System.out.println(userDto.toString());
        return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.CREATED);
    }

}
