package com.example.demo.controller;

import com.example.demo.dto.vehicles.CreateVehicleDTO;
import com.example.demo.service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public ModelAndView getPage(ModelAndView modelAndView, @RequestParam(required = false) Long brandId) {
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
