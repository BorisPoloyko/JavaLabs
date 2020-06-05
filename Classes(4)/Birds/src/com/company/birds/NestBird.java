package com.company.birds;

import java.util.InputMismatchException;
import java.util.InvalidPropertiesFormatException;

public class NestBird extends Bird{

    public NestBird(int age, String id) {
        super(age, id);
    }

    @Override
    public void sing() {
        System.out.println("Nest bird is singing!");
    }

    @Override
    public void layEggs() {
        System.out.println("Nest bird is laying an egg!");
    }

    public void hatch() {
        System.out.println("Nest bird is hatching!");
    }
}
