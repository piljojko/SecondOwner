package com.example.demo.controller;

import com.example.demo.constants.Util;
import com.example.demo.dto.vehicles.CreateVehicleDTO;
import com.example.demo.service.ImageService;
import com.example.demo.service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

    private VehicleService vehicleService;

    private ImageService imageService;

    public VehicleController(VehicleService vehicleService, ImageService imageService) {
        this.vehicleService = vehicleService;
        this.imageService = imageService;
    }

    @GetMapping
    public ModelAndView getPage(ModelAndView modelAndView, @RequestParam(required = false) Long brandId) {
        modelAndView.addObject("base64Images", imageService.getAll());
        modelAndView.setViewName("/pages/vehiclesPage");
        modelAndView.addObject("ListOfVehicles", vehicleService.getAllAsDTO());
        modelAndView.addObject("ListOfBrands", vehicleService.getAllBrandsAsDTO());
        if (brandId != null) {
            modelAndView.addObject("ListOfModels", vehicleService.getAllModelsByBrandIdAsDTO(brandId));
            modelAndView.addObject("selectedBrandId", brandId);
        }
        return modelAndView;
    }

    @PostMapping
    public ModelAndView createNewVehicle(ModelAndView modelAndView, @ModelAttribute CreateVehicleDTO vehicleRequest) {
        modelAndView.setViewName("pages/vehiclesPage");
        modelAndView.addObject("SuccessMessage", "Successfully created" + vehicleService.createAndReturnAsDTO(vehicleRequest));
        modelAndView.addObject("ListOfVehicles", vehicleService.getAllAsDTO());
        return modelAndView;
    }


}
