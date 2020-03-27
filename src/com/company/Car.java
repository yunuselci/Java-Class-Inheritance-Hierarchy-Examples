package com.company;

public class Car extends Vehicle implements Land {

    String brand;

    public Car(String model_name, String engine_type, String transmission_type, int hp, int year, double price, double weight, String brand) {
        super(model_name, engine_type, transmission_type, hp, year, price, weight);
        this.brand = brand;
    }

    public Car(){
        super();
        brand = "no_brand_name";
    }


    @Override
    public double calculateConsumption() {
        return 0;
    }

    @Override
    public double calculateMaxSpeed() {
        return 0;
    }

    @Override
    public double calculateTime(double km) {
        return 0;
    }

    @Override
    public void cartrunk_capacity(int capacity) {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
