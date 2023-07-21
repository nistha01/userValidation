package com.userManagementWithValidation.userManagementWithValidation.service;

import com.userManagementWithValidation.userManagementWithValidation.model.User;
import com.userManagementWithValidation.userManagementWithValidation.repository.UserRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public String addUser(User user) {
       userRepo.userList.add(user);
       return "User Is Added SuccessFully";
    }

    public List<User> getUser() {
        return userRepo.userList;
    }

    public User getUserById(Integer userId) {
        for(User user : userRepo.userList){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    public String updateUser(User user, Integer userId) {
        for(User user1 : userRepo.userList){
            if(user1.getUserId().equals(userId)){
                user1.setUserName(user.getUserName());
                user1.setDateOfBirth(user.getDateOfBirth());
                user1.setEmail(user.getEmail());
                user1.setPhoneNumber(user.getPhoneNumber());
                user1.setDate(user.getDate());
                user1.setTime(user.getTime());
                return "User Updated Successfully";
            }
        }
        return "Invalid User Id";
    }

    public String deleteUser(Integer userId) {
        for(User user : userRepo.userList){
            if(user.getUserId().equals(userId)){
                userRepo.userList.remove(user);
                return  "user Deleted";
            }
        }
        return "invalid User Id";
    }
}
