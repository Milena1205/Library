package com.project.library.service.impl;

import com.project.library.service.UserService;
import com.project.library.service.dto.UserRegistrationRequestDTO;
import com.project.library.service.dto.UserRegistrationResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserRegistrationResponseDTO createUser(UserRegistrationRequestDTO userRegistrationRequestDTO) {
        return null;
    }
}
