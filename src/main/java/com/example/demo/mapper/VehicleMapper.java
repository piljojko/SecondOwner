package com.example.demo.mapper;

import com.example.demo.dto.vehicles.GetVehicleDTO;
import com.example.demo.model.Vehicle;

public class VehicleMapper {
    public static GetVehicleDTO fromModelToDTO(Vehicle vehicle) {
        return new GetVehicleDTO(
                vehicle.getId(),
                vehicle.getModel().getBrand().getName(),
                vehicle.getModel().getName(),
                vehicle.getPrice());
    }
}
