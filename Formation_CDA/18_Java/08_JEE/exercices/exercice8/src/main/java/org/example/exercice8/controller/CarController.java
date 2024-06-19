package org.example.exercice8.controller;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.example.exercice8.model.Car;

import java.util.ArrayList;
import java.util.List;

@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarController {

    @GET
    @Path("/one")
    public Car getOneCar(){
        return new Car(1,"Peugeot",2001,"yellow");
    }

    @GET
    public List<Car> getAllCar(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(2,"Toyota",2020,"red"));
        carList.add(new Car(3,"Renault",2015,"blue"));
        carList.add(new Car(4,"Honda",2010,"green"));
        return carList;
    }


}
