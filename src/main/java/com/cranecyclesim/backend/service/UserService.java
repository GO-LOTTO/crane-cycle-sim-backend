package com.cranecyclesim.backend.service;

import com.cranecyclesim.backend.dto.UserDto;
import com.cranecyclesim.backend.jpa.entity.User;
import com.cranecyclesim.backend.jpa.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUserList(){
        return userRepository.findAll();
    }

    public User createUser(UserDto userDto){
        System.out.println(userDto.toString());
        User user = User.builder()
                    .userId(userDto.getUserId())
                    .password(userDto.getPassword())
                    .groupCd(userDto.getGroupCd())
                    .createdAt(userDto.getCreatedAt())
                    .createdUserId("SYSTEM")
                    .build();

        return userRepository.save(user);
    }

}
