package com.project.library.service;

import com.project.library.service.dto.UserRegistrationRequestDTO;
import com.project.library.service.dto.UserRegistrationResponseDTO;
import org.springframework.security.core.userdetails.User;

public interface UserService {
    UserRegistrationResponseDTO createUser(UserRegistrationRequestDTO userRegistrationRequestDTO);

    User findByEmail(String email);
}
