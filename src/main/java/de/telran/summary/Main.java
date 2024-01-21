package de.telran.summary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int a = 5;
//        Integer b = 2;
//
//        List<Integer> list = new ArrayList<>();
//
////        System.out.println("Hello world!");
////        System.out.println(b);
//
//        Person ivan = new Person("Ivan",24,1.78,75.65);
//        Person roma = new Person("Roma",30,1.95,81.4);
//
//        System.out.println(ivan.name);
//        System.out.println(roma.name);

        Car car = new Car("123","Mazda","black",180, 2018,"sedan",4);
        Motocycle motocycle = new Motocycle("454","Honda","black",100,2020,"bike");

        countBlackVehicles(new Vehicle[]{car,motocycle});

    }
    private static void countBlackVehicles(Vehicle[] vehicles) {
        int blackVehicles = 0;
        for(Vehicle vehicle : vehicles) {
            if (vehicle.color.equals("black")) {
                blackVehicles++;
            }
        }
        System.out.println("Black vehicles = " + blackVehicles);
    }
}