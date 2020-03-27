package com.company;



public class Main {

    public static void main(String[] args) {
        System.out.println("Default Objects Values: ");
        Vehicle v = new Vehicle();
        System.out.println(v);
        Car c = new Car();
        System.out.println(c);
        Boat b = new Boat();
        System.out.println(b);
        Truck t = new Truck();
        System.out.println(t);
        System.out.println("With Variables: ");
        Car carSkoda = new Car("Superb","Diesel","Automatic",135,2008,45000,1600,"Skoda");
        Boat fakirBoat = new Boat("Fakirler","Boat","Bilmez",123,123,123,123,123,123,123);
        Truck scaniaTruck = new Truck("S730","Diesel","Automatic",730,2020,1000000,5000,60000);
        System.out.println();
        System.out.println("#####CAR######");
        System.out.println(carSkoda);
        System.out.println("T.type: " + carSkoda.getTransmission_type());
        System.out.println("Brand: " + carSkoda.getBrand());
        System.out.println("Engine Type: " + carSkoda.getEngine_type());
        System.out.println("Model Name: " + carSkoda.getModel_name());
        System.out.println("Hp: " + carSkoda.getHp());
        System.out.println("Year: " + carSkoda.getYear());
        System.out.println("Price: " + carSkoda.getPrice());
        System.out.println("Weight: " + carSkoda.getWeight());
        System.out.println("Max Speed: " + carSkoda.calculateMaxSpeed());
        System.out.println("Consumption: " + carSkoda.calculateConsumption());
        System.out.println("Time: " + carSkoda.calculateTime(300));
        carSkoda.cartrunk_capacity(27000);
        System.out.println();
        System.out.println("#####BOAT######");
        System.out.println(fakirBoat);
        System.out.println("T.type: " + fakirBoat.getTransmission_type());
        System.out.println("Engine Type: " + fakirBoat.getEngine_type());
        System.out.println("Model Name: " + fakirBoat.getModel_name());
        System.out.println("Hp: " + fakirBoat.getHp());
        System.out.println("Year: " + fakirBoat.getYear());
        System.out.println("Price: " + fakirBoat.getPrice());
        System.out.println("Weight: " + fakirBoat.getWeight());
        System.out.println("Knot: " + fakirBoat.getKnot());
        System.out.println("Life Jacket: " + fakirBoat.getLifejacket());
        System.out.println("Wind Power: " + fakirBoat.getWindPower());
        System.out.println();
        System.out.println("#####TRUCK######");
        System.out.println(scaniaTruck);
        System.out.println("T.type: " + scaniaTruck.getTransmission_type());
        System.out.println("Engine Type: " + scaniaTruck.getEngine_type());
        System.out.println("Model Name: " + scaniaTruck.getModel_name());
        System.out.println("Hp: " + scaniaTruck.getHp());
        System.out.println("Year: " + scaniaTruck.getYear());
        System.out.println("Price: " + scaniaTruck.getPrice());
        System.out.println("Weight: " + scaniaTruck.getWeight());
        System.out.println("Max Load Capacity: " + scaniaTruck.getMaxLoadCapacity());
        System.out.println("Max Speed: " + scaniaTruck.calculateMaxSpeed());
        System.out.println("Consumption: " + scaniaTruck.calculateConsumption());
        System.out.println("Time: " + scaniaTruck.calculateTime(300));
        scaniaTruck.cartrunk_capacity(27000);

    }
}
