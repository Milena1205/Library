package com.project.library.service;

import com.project.library.model.User;
import com.project.library.service.dto.UserRegistrationRequestDTO;
import com.project.library.service.dto.UserRegistrationResponseDTO;


public interface UserService {
    UserRegistrationResponseDTO createUser(UserRegistrationRequestDTO userRegistrationRequestDTO);

    User findByEmail(String email);
}
