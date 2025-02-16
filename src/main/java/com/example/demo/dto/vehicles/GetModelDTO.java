package com.example.demo.dto.vehicles;

public class GetModelDTO {

    private Long id;
    private String name;

    public GetModelDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
