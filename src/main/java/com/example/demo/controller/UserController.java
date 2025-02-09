package com.example.demo.controller;

import com.example.demo.dto.users.CreateRegistrationDTO;
import com.example.demo.dto.users.GetUserDTO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ModelAndView getAll(ModelAndView modelAndView) {
        modelAndView.setViewName("/pages/registration");
        List<User> allUsers = userService.getAll();
        List<GetUserDTO> listOfUsers = new ArrayList<>();
        for (User u : allUsers) {
            listOfUsers.add(new GetUserDTO(u.getId(), u.getName(), u.getLastName(), u.getEmail(), u.getUsername()));
        }
        modelAndView.addObject("ListOfUsers", listOfUsers);
        return modelAndView;
    }

    @PostMapping
    public ModelAndView register(ModelAndView modelAndView, @ModelAttribute CreateRegistrationDTO createRequest) {
        modelAndView.setViewName("pages/registration");
        try {

            User registratedUser = userService.create(UserMapper.fromDTOToModel(createRequest));
            GetUserDTO response = UserMapper.fromModelToDTO(registratedUser);
            modelAndView.addObject("SuccessMessage", "Successfully created" + response.toString());


        } catch (RuntimeException ex) {
            modelAndView.addObject("ErrorMessage", ex.getMessage());
        }

        List<User> allUsers = userService.getAll();
        List<GetUserDTO> listOfUsers = new ArrayList<>();
        for (User u : allUsers) {
            listOfUsers.add(UserMapper.fromModelToDTO(u));
        }
        modelAndView.addObject("ListOfUsers", listOfUsers);
        return modelAndView;
    }
}
