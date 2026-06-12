package com.example.git.service;

import com.example.git.dto.UserDto;
import com.example.git.entity.User;
import com.example.git.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo=userRepo;
    }
    public User createUser(UserDto userDto){
        User user=new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        return userRepo.save(user);
    }
}
