package com.project.library.web.rest.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public interface UserController<UserLoginRequest, UserRegistrationRequest> {

    @PostMapping(value = "/register")
    ResponseEntity<?> createUser(@RequestBody UserRegistrationRequest userRegistrationRequest,
                                 BindingResult bindingResult);

    @PostMapping(value = "/login")
    ResponseEntity<?> loginUser(@RequestBody UserLoginRequest userLoginRequest, BindingResult bindingResult);
}
