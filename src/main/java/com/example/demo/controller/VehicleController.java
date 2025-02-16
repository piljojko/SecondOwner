package com.example.demo.controller;

import com.example.demo.dto.vehicles.CreateVehicleDTO;
import com.example.demo.dto.vehicles.GetVehicleDTO;
import com.example.demo.mapper.VehicleMapper;
import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public ModelAndView getAll(ModelAndView modelAndView){
        modelAndView.setViewName("/pages/vehiclesPage");
        List<Vehicle> allVehicles = vehicleService.getAll();
        List<GetVehicleDTO> listOfVehicles = new ArrayList<>();
        for(Vehicle v: allVehicles) {
            listOfVehicles.add(VehicleMapper.fromModelToDTO(v));
        }
        modelAndView.addObject("ListOfVehicles", listOfVehicles);
        return modelAndView;
    }

    @PostMapping
    public ModelAndView createNewVehicle(ModelAndView modelAndView, @ModelAttribute CreateVehicleDTO vehicleRequest){
        modelAndView.setViewName("pages/vehiclesPage");

        Vehicle savedVehicle =  vehicleService.create(vehicleRequest);
        GetVehicleDTO response = VehicleMapper.fromModelToDTO(savedVehicle);
        modelAndView.addObject("SuccessMessage", "Successfully created" + response);
        List<Vehicle> allVehicles = vehicleService.getAll();
        List<GetVehicleDTO> listOfVehicles = new ArrayList<>();
        for(Vehicle v: allVehicles) {
            listOfVehicles.add(VehicleMapper.fromModelToDTO(v));
        }
        modelAndView.addObject("ListOfVehicles", listOfVehicles );
        return modelAndView;
    }


}
