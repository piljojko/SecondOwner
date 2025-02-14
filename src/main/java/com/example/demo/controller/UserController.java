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

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ModelAndView getPage(ModelAndView modelAndView) {
        modelAndView.setViewName("/pages/registration");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView register(ModelAndView modelAndView, @ModelAttribute CreateRegistrationDTO createRequest) {
        modelAndView.setViewName("pages/registration");
        try {
            User registratedUser = userService.create(UserMapper.fromDTOToModel(createRequest));
            GetUserDTO response = UserMapper.fromModelToDTO(registratedUser);
            modelAndView.addObject("RegisteredUser", response);
        } catch (RuntimeException ex) {
            modelAndView.addObject("ErrorMessage", ex.getMessage());
        }
        return modelAndView;

    }
}
