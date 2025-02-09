package com.example.demo.dto.vehicles;

public class GetVehicleDTO {
    private Long id;
    private String brand;
    private String model;
    private String color;

    public GetVehicleDTO(Long id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "vozilo [" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ']';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
