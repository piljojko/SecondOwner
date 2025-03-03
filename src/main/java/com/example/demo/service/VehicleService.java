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
    private ModelService modelService;
    private BrandService brandService;

    public VehicleService(VehicleRepository vehicleRepository, ModelService modelService, BrandService brandService) {
        this.vehicleRepository = vehicleRepository;
        this.modelService = modelService;
        this.brandService = brandService;
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
        Model model = modelService.get(vehicleDTO.getModelId());
        Vehicle vehicle = new Vehicle();
        vehicle.setModel(model);
        vehicle.setPrice(vehicleDTO.getPrice());
        return vehicleRepository.save(vehicle);
    }

    public GetVehicleDTO createAndReturnAsDTO(CreateVehicleDTO vehicleDTO) {
        return VehicleMapper.fromModelToDTO(create(vehicleDTO));
    }

    private List<Brand> getAllBrands() {
        return brandService.getAll();
    }

    public List<GetBrandDTO> getAllBrandsAsDTO() {
        List<GetBrandDTO> result = new ArrayList<>();
        for (Brand b : getAllBrands()) {
            result.add(BrandMapper.fromModelToDTO(b));
        }
        return result;
    }

    public List<GetModelDTO> getAllModelsByBrandIdAsDTO(Long brandId) {
        List<GetModelDTO> result = new ArrayList<>();
        for (Model m : modelService.getAllByBrandId(brandId)) {
            result.add(ModelMapper.fromModelToDTO(m));
        }
        return result;
    }



}
