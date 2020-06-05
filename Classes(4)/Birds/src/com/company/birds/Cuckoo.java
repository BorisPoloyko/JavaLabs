package com.company.birds;

public class Cuckoo extends Bird{

    public Cuckoo(int age, String id) {
        super(age, id);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public void fly() {
        System.out.println("Cuckoo is flying!");
    }

    @Override
    public void sing() {
        System.out.println("Cuckoo is singing!");
    }

}
