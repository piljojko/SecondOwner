package com.example.demo.service;

import com.example.demo.dto.vehicles.GetBrandDTO;
import com.example.demo.dto.vehicles.GetModelDTO;
import com.example.demo.mapper.BrandMapper;
import com.example.demo.mapper.ModelMapper;
import com.example.demo.model.Brand;
import com.example.demo.model.Model;
import com.example.demo.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandService {

    private BrandRepository brandRepository;

    private ModelService modelService;

    public BrandService(BrandRepository brandRepository, ModelService modelService) {
        this.brandRepository = brandRepository;
        this.modelService = modelService;
    }

    public List<Brand> getAll(){
        return  brandRepository.findAll();
    }

    public List<GetBrandDTO> getAllBrandsAsDTO(){
        List<GetBrandDTO> result = new ArrayList<>();
        for(Brand b : getAll()){
            result.add(BrandMapper.fromModelToDTO(b));
        }
        return result;
    }

    private  List<Model> getAllModelsByBrandId(Long brandId){
        return modelService.getAllByBrandId(brandId);
    }

    public List<GetModelDTO> getAllModelsByBrandIdAsDTO(Long brandId){
        List<GetModelDTO> result = new ArrayList<>();
        for(Model m : getAllModelsByBrandId(brandId)){
            result.add(ModelMapper.fromModelToDTO(m));
        }
        return result;
    }




}
