package com.example.demo.repository;

import com.example.demo.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {

    private List<Vehicle> vehicleList;

    public VehicleRepository() {
        vehicleList = new ArrayList<>(List.of(
                new Vehicle(1L, "Toyota", "Yaris", "Black"),
                new Vehicle(2L, "Honda", "Civic", "White"),
                new Vehicle(3L, "Fiat", "500", "Blue")
        ));
    }

    public Vehicle create(Vehicle vehicle){
        vehicle.setId(Long.valueOf(vehicleList.size()+1));
        vehicleList.add(vehicle);
        return  vehicle;
    }

    public List<Vehicle> getAll(){
        return  vehicleList;
    }
}
