package org.example.exercice8;

public class Car {

    private int id;
    private String brand;
    private String manufacturingYear;
    private String color;

    public Car() {
    }

    public Car(int id, String brand, String manufacturingYear, String color) {
        this.id = id;
        this.brand = brand;
        this.manufacturingYear = manufacturingYear;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
