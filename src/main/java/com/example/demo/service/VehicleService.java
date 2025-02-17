package com.example.demo.service;

import com.example.demo.dto.vehicles.CreateVehicleDTO;
import com.example.demo.dto.vehicles.GetBrandDTO;
import com.example.demo.dto.vehicles.GetModelDTO;
import com.example.demo.dto.vehicles.GetVehicleDTO;
import com.example.demo.mapper.BrandMapper;
import com.example.demo.mapper.ModelMapper;
import com.example.demo.mapper.VehicleMapper;
import com.example.demo.model.Brand;
import com.example.demo.model.Model;
import com.example.demo.model.Vehicle;
import com.example.demo.repository.BrandRepository;
import com.example.demo.repository.ModelRepository;
import com.example.demo.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {
    private VehicleRepository vehicleRepository;
    private ModelRepository modelRepository;
    private BrandRepository brandRepository;

    public VehicleService(VehicleRepository vehicleRepository, ModelRepository modelRepository, BrandRepository brandRepository) {
        this.vehicleRepository = vehicleRepository;
        this.modelRepository = modelRepository;
        this.brandRepository = brandRepository;
    }

    private List<Vehicle> getAll() {
        return vehicleRepository.findAll();
    }

    public List<GetVehicleDTO> getAllAsDTO() {
        List<GetVehicleDTO> result = new ArrayList<>();
        for (Vehicle v : getAll()) {
            result.add(VehicleMapper.fromModelToDTO(v));
        }
        return result;
    }

    private Vehicle create(CreateVehicleDTO vehicleDTO) {
        Model model = modelRepository.findById(vehicleDTO.getModelId()).get();
        Vehicle vehicle = new Vehicle();
        vehicle.setModel(model);
        vehicle.setPrice(vehicleDTO.getPrice());
        return vehicleRepository.save(vehicle);
    }

    public GetVehicleDTO createAndReturnAsDTO(CreateVehicleDTO vehicleDTO) {
        return VehicleMapper.fromModelToDTO(create(vehicleDTO));
    }

    private List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    public List<GetBrandDTO> getAllBrandsAsDTO() {
        List<GetBrandDTO> result = new ArrayList<>();
        for (Brand b : getAllBrands()) {
            result.add(BrandMapper.fromModelToDTO(b));
        }
        return result;
    }


    private List<Model> getAllModels() {
        return modelRepository.findAll();
    }

    private List<Model> getAllModelsByBrandId(Long brandId) {
        return modelRepository.getAllByBrandId(brandId);
    }

    public List<GetModelDTO> getAllModelsByBrandIdAsDTO(Long brandId) {
        List<GetModelDTO> result = new ArrayList<>();
        for (Model m : getAllModelsByBrandId(brandId)) {
            result.add(ModelMapper.fromModelToDTO(m));
        }
        return result;
    }

    public List<GetModelDTO> getAllModelsAsDTO() {
        List<GetModelDTO> result = new ArrayList<>();
        for (Model m : getAllModels()) {
            result.add(ModelMapper.fromModelToDTO(m));
        }
        return result;
    }

}
