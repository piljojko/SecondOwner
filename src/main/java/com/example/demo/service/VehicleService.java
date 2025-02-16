package com.example.demo.service;

import com.example.demo.dto.vehicles.CreateVehicleDTO;
import com.example.demo.model.Model;
import com.example.demo.model.Vehicle;
import com.example.demo.repository.ModelRepository;
import com.example.demo.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    private VehicleRepository vehicleRepository;
    private ModelRepository modelRepository;

    public VehicleService(VehicleRepository vehicleRepository, ModelRepository modelRepository) {
        this.vehicleRepository = vehicleRepository;
        this.modelRepository = modelRepository;
    }

    public List<Vehicle> getAll() {
        return vehicleRepository.findAll();

    }

    public Vehicle create(CreateVehicleDTO vehicleDTO) {
        Model model = modelRepository.findById(vehicleDTO.getModelId()).get();
        Vehicle vehicle = new Vehicle();
        vehicle.setModel(model);
        vehicle.setPrice(vehicleDTO.getPrice());
        return vehicleRepository.save(vehicle);
    }
}
