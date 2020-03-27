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
        return weight*4.85;
    }

    @Override
    public double calculateMaxSpeed() {
        return hp*0.35;
    }

    @Override
    public double calculateTime(double km) {
        return  (double) (km/calculateMaxSpeed());
    }

    @Override
    public void cartrunk_capacity(int capacity) {
        if(capacity >= maxLoadCapacity){
            System.out.println("Capacity limits exceeded");
        }else{
            System.out.println("You can load your belongings");
        }
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
