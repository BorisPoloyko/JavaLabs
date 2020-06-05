package com.company.clothes;

import java.util.StringJoiner;

public abstract class Clothes implements ICloth {
    public Clothes(String color)
    {
        this.color = color;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Clothes.class.getSimpleName() + "[", "]")
                .add("color='" + color + "'")
                .toString();
    }

    protected String color;
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public abstract boolean ifFits(String size);


}
