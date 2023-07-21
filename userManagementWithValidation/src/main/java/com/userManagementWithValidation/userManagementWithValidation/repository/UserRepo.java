package com.userManagementWithValidation.userManagementWithValidation.repository;

import com.userManagementWithValidation.userManagementWithValidation.model.User;
import jakarta.validation.constraints.Past;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
   public List<User> userList = new ArrayList<>();
}
