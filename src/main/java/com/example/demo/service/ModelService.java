package com.example.demo.service;

import com.example.demo.dto.vehicles.GetModelDTO;
import com.example.demo.mapper.ModelMapper;
import com.example.demo.model.Model;
import com.example.demo.repository.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModelService {

    private ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public List<Model> getAll() {
        return modelRepository.findAll();
    }

    public List<Model> getAllByBrandId(Long brandId) {
        return modelRepository.getAllByBrandId(brandId);
    }

    public Model get(Long id) {
        return modelRepository.findById(id).get();
    }

}
