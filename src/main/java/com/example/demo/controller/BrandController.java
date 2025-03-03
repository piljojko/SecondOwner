package com.example.demo.controller;

import com.example.demo.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/brands")
public class BrandController {

    private BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping
    public ModelAndView getBrandsAndModels(ModelAndView modelAndView, @RequestParam(required = false) Long brandId){
        modelAndView.setViewName("/pages/brands");
        modelAndView.addObject("ListOfBrands", brandService.getAllBrandsAsDTO());
        if (brandId != null) {
            modelAndView.addObject("ListOfModels", brandService.getAllModelsByBrandIdAsDTO(brandId));
            modelAndView.addObject("selectedBrandId", brandId);
        }
        return modelAndView;
    }
}
