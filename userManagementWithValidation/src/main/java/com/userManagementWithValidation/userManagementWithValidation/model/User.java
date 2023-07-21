package com.userManagementWithValidation.userManagementWithValidation.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
     @NotNull(message = "userId cant be null")
     private Integer userId;
     @NotBlank(message = "Name field is Mandatory")
     @Size(min = 5 ,max =10 , message = "size of the name should be in the range of 5 to 10")
     private String userName;

     @NotNull
     @Past
     private LocalDate dateOfBirth;
     @Email
     private String email;
     @NotBlank
     @Pattern(regexp = "^\\d{10}$",message = "The length of the phone number should be 10 with Extension +91")
     private String phoneNumber;

     @NotNull
     @FutureOrPresent

     private LocalDate date;

     @NotNull
     private Time time;

}
