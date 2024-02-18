package com.project.library.fascade;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

public interface UserFacade<UserLoginRequest, UserRegistrationRequest> {

    ResponseEntity<?> createUser(UserRegistrationRequest userRegistrationRequest, BindingResult bindingResult);

    ResponseEntity<?> loginUser(UserLoginRequest userLoginRequest, BindingResult bindingResult);
}
