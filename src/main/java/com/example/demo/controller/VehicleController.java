package com.example.demo.controller;

import com.example.demo.dto.vehicles.CreateVehicleDTO;
import com.example.demo.dto.vehicles.GetVehicleDTO;
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
        modelAndView.addObject("ListOfVehicles", vehicleService.getAll());
        return modelAndView;
    }

    @PostMapping()
    public ModelAndView createNewVehicle(ModelAndView modelAndView, @ModelAttribute CreateVehicleDTO vehicleRequest){
        modelAndView.setViewName("pages/vehiclesPage");

        Vehicle vehicle = new Vehicle(vehicleRequest.getBrand(), vehicleRequest.getModel(), vehicleRequest.getColor());
        Vehicle savedVehicle =  vehicleService.create(vehicle);
        GetVehicleDTO response = new GetVehicleDTO(savedVehicle.getId(), savedVehicle.getBrand(), savedVehicle.getModel(), savedVehicle.getColor());
        modelAndView.addObject("SuccessMessage", "Successfully created" + response.toString());
        List<Vehicle> allVehicles = vehicleService.getAll();
        List<GetVehicleDTO> listOfVehicles = new ArrayList<>();
        for(Vehicle v: allVehicles) {
            listOfVehicles.add(new GetVehicleDTO(v.getId(), v.getBrand(), v.getModel(), v.getColor()));
        }
        modelAndView.addObject("ListOfVehicles", listOfVehicles );
        return modelAndView;
    }


}
