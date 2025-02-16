package com.example.demo.dto.vehicles;

public class CreateVehicleDTO {
    private Long modelId;
    private Long price;

    public CreateVehicleDTO() {
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
