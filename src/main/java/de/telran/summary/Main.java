package de.telran.summary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 2;

        List<Integer> list = new ArrayList<>();

//        System.out.println("Hello world!");
//        System.out.println(b);

        Person ivan = new Person("Ivan",24,1.78,75.65);
        Person roma = new Person("Roma",30,1.95,81.4);

        System.out.println(ivan.name);
        System.out.println(roma.name);
    }
}