package org.example.exercice9.controller;

import jakarta.enterprise.context.Initialized;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.exercice9.data.FakeDB;
import org.example.exercice9.model.Car;
import org.example.exercice9.service.CarService;
import org.jboss.logging.annotations.Param;

import java.util.ArrayList;
import java.util.List;

@Path("/cars")
public class CarController {

    private final CarService carService;

    @Inject CarController(CarService carService){
        this.carService = carService;
    }

    @GET
    @Path("get")
    @Produces("application/json")
    public List<Car> getManyCars(){
        return FakeDB.cars;
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Car getCarById(@PathParam("id")int id){
        for (Car car : FakeDB.cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        throw new NotFoundException("Car with ID " + id + " not found");
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Car postCar (Car car){
        FakeDB.cars.add(car);
        return car;
    }

/*    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Car updateCar(@QueryParam("id") int id, @QueryParam("brand") String brand, @QueryParam("manufacturingYear") String manufacturingYear, @QueryParam("color") String color){
        for (Car car : FakeDB.cars) {
            if (car.getId() == id) {
                car.setBrand(brand);
                car.setManufacturingYear(manufacturingYear);
                car.setColor(color);
                return car;
            }
        }
        return carService.save()
    }*/

    @DELETE
    @Path("{id}")
    public int delete(@PathParam("id") int id){
        FakeDB.cars.remove(id-1);
        return id;
    }
}
