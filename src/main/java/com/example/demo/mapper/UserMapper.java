package com.example.demo.mapper;

import com.example.demo.dto.users.CreateRegistrationDTO;
import com.example.demo.dto.users.GetUserDTO;
import com.example.demo.model.User;

public class UserMapper {

    public static User fromDTOToModel(CreateRegistrationDTO userDTO){
        return  new User(
                userDTO.getName(),
                userDTO.getLastName(),
                userDTO.getEmail(),
                userDTO.getUsername(),
                userDTO.getPassword()
        );
    }

    public static GetUserDTO fromModelToDTO(User user){
        return  new GetUserDTO(
                user.getId(),
                user.getName(),
                user.getLastName(),
                user.getEmail(),
                user.getUsername()
        );
    }
}
