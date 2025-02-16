package com.example.demo.mapper;

import com.example.demo.dto.vehicles.GetModelDTO;
import com.example.demo.model.Model;

public class ModelMapper {

    public static GetModelDTO fromModelToDTO(Model model) {
        return new GetModelDTO(
                model.getId(),
                model.getName()
        );
    }

}
