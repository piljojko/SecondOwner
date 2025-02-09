package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping
    public ModelAndView home(ModelAndView modelAndView){
        modelAndView.setViewName("pages/index");
        modelAndView.addObject("message", "Pozdrav iz dinamicke poruke");
        return modelAndView;
    }
}
