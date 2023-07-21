package com.userManagementWithValidation.userManagementWithValidation.controller;

import com.userManagementWithValidation.userManagementWithValidation.model.User;
import com.userManagementWithValidation.userManagementWithValidation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    //add User
    @PostMapping("user")
    public String addUser(@Valid @RequestBody User user){
       return userService.addUser(user);
    }
    @GetMapping("user")
    public List<User> getUser(){
        return userService.getUser();
    }
    @GetMapping("user/userId/{userId}")
    public User getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }
    @PutMapping("user/userId/{userId}")
    public String updateUser(@Valid @RequestBody User user,@PathVariable Integer userId){
        return userService.updateUser(user,userId);
    }
    @DeleteMapping("user/userId/{userId}")
    public String deleteUser(@PathVariable Integer userId){
        return userService.deleteUser(userId);
    }
}
