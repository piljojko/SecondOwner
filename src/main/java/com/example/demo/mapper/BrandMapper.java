package com.example.demo.mapper;

import com.example.demo.dto.vehicles.GetBrandDTO;
import com.example.demo.model.Brand;

public class BrandMapper {

    public static GetBrandDTO fromModelToDTO(Brand brand){
        return new GetBrandDTO(
                brand.getId(),
                brand.getName()
        );
    }

}
