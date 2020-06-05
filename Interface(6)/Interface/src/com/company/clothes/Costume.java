package com.company.clothes;

import java.util.StringJoiner;

public class Costume extends Clothes {
    private String size;

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        try {
            if (!size.equals("XS") || !size.equals("S") || !size.equals("M") || !size.equals("L") || !size.equals("XL"))
            {
                throw new Exception("Wrong data!");
            }
            this.size = size;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public Costume(String size, String color){
        super(color);
        this.size = size;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean ifFits(String size) {
        return size.equals(this.size);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Costume.class.getSimpleName() + "[", "]")
                .add("size='" + size + "'")
                .add("color='" + color + "'")
                .toString();
    }
}
