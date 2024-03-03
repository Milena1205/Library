package com.project.library.service;

import com.project.library.IntegrationTestPrototype;
import com.project.library.model.User;
import com.project.library.service.dto.UserRegistrationRequestDTO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends IntegrationTestPrototype {

//    @Autowired
//    private UserService userService;
//
//    public UserServiceTest(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Test
//    public void testCreateUser() {
//
//        UserRegistrationRequestDTO userRegistrationRequestDTO = new UserRegistrationRequestDTO();
//        String email = "milenajovanovic786@gmail.com";
//        userRegistrationRequestDTO.setEmail(email);
//        UserRegistrationRequestDTO.setFullName("Milena Jovanovic");
//        UserRegistrationRequestDTO.setPassword("Milena123@");
//
//        userService.createUser(userRegistrationRequestDTO);
//
//        User savedUser = userService.findByEmail(email);
//        Assert.assertEquals(savedUser.getEmail(), email);
//    }
}
