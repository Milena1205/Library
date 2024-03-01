package com.project.library.repository;


import com.project.library.LibraryApplicationTests;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;

public class UserRepositoryTest extends LibraryApplicationTests {

    @Autowired
    UserRepository userRepository;

    public void TestSaveUser() {
        String email = null;
        User user = new User();
        email = "milenajovanovic786@gmail.com";
        user.setEmail(email);
        user.setFullName("Milena Jovanovic");
        user.setPassword("Milena123@");

        userRepository.save(user);

        User savedUser = userRepository.findUserByEmail(email).orElseThrow();
        Assert.assertEquals(savedUser.getEmail(), email);

    }

}
