package com.example.demo.mapper;

import com.example.demo.dto.vehicles.CreateVehicleDTO;
import com.example.demo.dto.vehicles.GetVehicleDTO;
import com.example.demo.model.Vehicle;

public class VehicleMapper {

    public static Vehicle fromDTOToModel(CreateVehicleDTO vehicleDTO) {
        return new Vehicle(
                vehicleDTO.getBrand(),
                vehicleDTO.getModel(),
                vehicleDTO.getColor());
    }

    public static GetVehicleDTO fromModelToDTO(Vehicle vehicle) {
        return new GetVehicleDTO(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getColor());
    }
}
