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
    public void testSaveUser() {
        User user = new User();
        String email  = "milenajovanovic786@gmail.com";
        String fullName = "Milena Jovanovic";
        user.setEmail(email);
        user.setFullName(fullName);
        user.setPassword("Milena123@");

        userRepository.save(user);

        User savedUser = userRepository.findUserByEmail(email).orElseThrow();
        assertEquals(savedUser.getEmail(), email);
        assertEquals(savedUser.getFullName(), fullName);
    }
}
