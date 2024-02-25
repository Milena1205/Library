package com.project.library.fascade.mapper;

import com.project.library.fascade.model.request.UserRegistrationRequest;
import com.project.library.fascade.model.response.UserRegistrationResponse;
import com.project.library.service.dto.UserRegistrationRequestDTO;
import com.project.library.service.dto.UserRegistrationResponseDTO;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface UserFacadeMapper {

    UserRegistrationRequestDTO userRegistrationRequestToDto(UserRegistrationRequest userRegistrationRequest);
    UserRegistrationResponse userRegistrationResponseDtoToResponse(UserRegistrationResponseDTO userRegistrationResponseDTO);
}
