package com.company.birds;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.StringJoiner;

public abstract class Bird {
    private int age;

    private String id;

    public Bird(int age, String id) {
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100){
            throw new InputMismatchException();
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return age == bird.age &&
                id.equals(bird.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, id);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bird.class.getSimpleName() + "[", "]")
                .add("age=" + age)
                .add("id='" + id + "'")
                .toString();
    }

    public void sing(){
        System.out.println("Bird is singing!");
    }

    public void layEggs(){
        System.out.println("Bird is laying an egg!");
    }

}

