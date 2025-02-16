package com.example.demo.dto.vehicles;

public class GetVehicleDTO {
    private Long id;
    private String brand;
    private String model;
    private Long price;

    public GetVehicleDTO(Long id, String brand, String model, Long price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" +
                "brand: " + brand +
                ", model: " + model +
                ", price: " + price +
                ']';
    }
}
