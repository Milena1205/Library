package com.project.library.fascade.impl;

import com.project.library.fascade.UserFacade;
import com.project.library.fascade.mapper.UserFacadeMapper;
import com.project.library.fascade.model.request.UserLoginRequest;
import com.project.library.fascade.model.request.UserRegistrationRequest;
import com.project.library.fascade.model.response.UserRegistrationResponse;
import com.project.library.service.UserService;
import com.project.library.service.dto.UserRegistrationRequestDTO;
import com.project.library.service.dto.UserRegistrationResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Component
public class UserFacadeImpl implements UserFacade {

    private final UserService userService;
    private final UserFacadeMapper mapper;

    public UserFacadeImpl(UserService userService, UserFacadeMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @Override
    public ResponseEntity<?> createUser(UserRegistrationRequest userRegistrationRequest, BindingResult bindingResult) {

        UserRegistrationRequestDTO userRegistrationRequestDTO = mapper.userRegistrationRequestToDto(userRegistrationRequest);

        UserRegistrationResponseDTO userRegistrationResponseDTO = userService.createUser(userRegistrationRequestDTO);

        UserRegistrationResponse userRegistrationResponse = mapper.
                userRegistrationResponseDtoToResponse(userRegistrationResponseDTO);

        return new ResponseEntity<>(userRegistrationResponse, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> loginUser(UserLoginRequest userLoginRequest, BindingResult bindingResult) {
        return null;
    }
}
