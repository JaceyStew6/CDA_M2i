package org.example.exercice8;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.ArrayList;
import java.util.List;

@Path("/cars")
public class CarRessource {
    @GET
    @Path("/one")
    @Produces("application/json")
    public Car getOneCar(){
        return new Car(1, "Dacia", "2021", "grey");
    }

    @GET
    @Path("")
    @Produces("application/json")
    public List<Car> getManyCars(){
        List<Car> cars = new ArrayList<>();
        Car car2 = new Car(2, "Renault", "2016", "blue");
        Car car3 = new Car(3, "Peugeot", "2026", "black");
        cars.add(car2);
        cars.add(car3);
        return cars;
    }
}
