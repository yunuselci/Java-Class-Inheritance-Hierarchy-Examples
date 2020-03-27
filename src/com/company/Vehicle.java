package com.company;

public class Vehicle {
    String model_name;
    String engine_type;
    String transmission_type;
    int hp;
    int year;
    double price;
    double weight;

    public Vehicle(String model_name, String engine_type, String transmission_type, int hp, int year, double price, double weight) {
        this.model_name = model_name;
        this.engine_type = engine_type;
        this.transmission_type = transmission_type;
        this.hp = hp;
        this.year = year;
        this.price = price;
        this.weight = weight;
    }

    public Vehicle() {
        model_name = "no model_name";
        engine_type = "no engine_type";
        transmission_type = "no transmission type";
        hp = -1;
        year = -1;
        price = -1;
        weight = -1;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public String getTransmission_type() {
        return transmission_type;
    }

    public void setTransmission_type(String transmission_type) {
        this.transmission_type = transmission_type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model_name='" + model_name + '\'' +
                ", engine_type='" + engine_type + '\'' +
                ", transmission_type='" + transmission_type + '\'' +
                ", hp=" + hp +
                ", year=" + year +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
