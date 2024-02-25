package com.project.library.fascade;

import com.project.library.fascade.model.request.UserLoginRequest;
import com.project.library.fascade.model.request.UserRegistrationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

public interface UserFacade {

    ResponseEntity<?> createUser(UserRegistrationRequest userRegistrationRequest, BindingResult bindingResult);

    ResponseEntity<?> loginUser(UserLoginRequest userLoginRequest, BindingResult bindingResult);
}
