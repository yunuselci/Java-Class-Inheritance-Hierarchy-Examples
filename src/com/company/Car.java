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
        return weight*1.35;
    }

    @Override
    public double calculateMaxSpeed() {
        return hp*1.40;
    }

    @Override
    public double calculateTime(double km) {
        return  (double) (km/calculateMaxSpeed());
        // x = v.t
    }

    @Override
    public void cartrunk_capacity(int capacity) {
        if(capacity >= weight/4){
            System.out.println("Capacity limits exceeded");
        }else{
            System.out.println("You can load your belongings");
        }
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
