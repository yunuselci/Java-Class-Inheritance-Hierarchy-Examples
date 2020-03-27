package com.company;

public class Boat extends Vehicle implements Sea {
    int knot;
    double windPower;
    int lifejacket;

    public Boat(String model_name, String engine_type, String transmission_type, int hp, int year, double price, double weight, int knot, double windPower, int lifejacket) {
        super(model_name, engine_type, transmission_type, hp, year, price, weight);
        this.knot = knot;
        this.windPower = windPower;
        this.lifejacket = lifejacket;
    }

    public Boat() {
        knot = -1;
        windPower = -1;
        lifejacket = -1;
    }

    public int getKnot() {
        return knot;
    }

    public void setKnot(int knot) {
        this.knot = knot;
    }

    public double getWindPower() {
        return windPower;
    }

    public void setWindPower(double windPower) {
        this.windPower = windPower;
    }

    public int getLifejacket() {
        return lifejacket;
    }

    public void setLifejacket(int lifejacket) {
        this.lifejacket = lifejacket;
    }

    @Override
    public void length_information(int length) {
        if (length < 10) {
            System.out.println("Fisherman Boat");
        } else {
            System.out.println("Yacht");
        }
    }

    @Override
    public int calculateCapacity() {
        return (int) (lifejacket * 0.80);
    }

    @Override
    public double calculateCurrentKnot() {
        if (windPower < 0) {
            return (((knot) + (hp * windPower)) / 10) * -1;
        } else {
            return ((knot + (hp * windPower)) / 10);
        }
    }

    @Override
    public String toString() {
        return "Boat{" +
                "knot=" + knot +
                ", windPower=" + windPower +
                ", lifejacket=" + lifejacket +
                '}';
    }
}
