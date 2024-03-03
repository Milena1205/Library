package com.project.library.repository;

import com.project.library.IntegrationTestPrototype;
import com.project.library.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRepositoryTest extends IntegrationTestPrototype {

    @Autowired
    UserRepository userRepository;

    @Test
    public void TestSaveUser() {
        String email = null;
        User user = new User();
        email = "milenajovanovic786@gmail.com";
        user.setEmail(email);
        user.setFullName("Milena Jovanovic");
        user.setPassword("Milena123@");

        userRepository.save(user);

        User savedUser = userRepository.findUserByEmail(email).orElseThrow();
        assertEquals(savedUser.getEmail(), email);

    }

}
