package de.telran.summary;

public abstract class Vehicle {
    String vin;
    String model;
    String color;
    int power;
    int year;

    public Vehicle(String vin, String model, String color, int power, int year) {
        this.vin = vin;
        this.model = model;
        this.color = color;
        this.power = power;
        this.year = year;
    }
}
