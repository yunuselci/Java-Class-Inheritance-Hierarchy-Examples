package com.company;

public class Truck extends Vehicle implements Land {

    int maxLoadCapacity;

    public Truck(String model_name, String engine_type, String transmission_type, int hp, int year, double price, double weight, int maxLoadCapacity) {
        super(model_name, engine_type, transmission_type, hp, year, price, weight);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public Truck() {
        maxLoadCapacity = -1;
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

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }
}
