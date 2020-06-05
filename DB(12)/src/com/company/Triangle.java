package com.company;

import java.util.StringJoiner;

public class Triangle {
    private int id, a_x, a_y, b_x, b_y, c_x, c_y;

    public Triangle(int id, int a_x, int a_y, int b_x, int b_y, int c_x, int c_y) {
        this.id = id;
        this.a_x = a_x;
        this.a_y = a_y;
        this.b_x = b_x;
        this.b_y = b_y;
        this.c_x = c_x;
        this.c_y = c_y;
        this.A = Distance.distance(a_x, a_y, b_x, b_y);
        this.B = Distance.distance(b_x, b_y, c_x, c_y);
        this.C = Distance.distance(c_x, c_y, a_x, a_y);
    }

    private double A, B ,C;

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public int getA_x() {
        return a_x;
    }

    public void setA_x(int a_x) {
        this.a_x = a_x;
    }

    public int getA_y() {
        return a_y;
    }

    public void setA_y(int a_y) {
        this.a_y = a_y;
    }

    public int getB_x() {
        return b_x;
    }

    public void setB_x(int b_x) {
        this.b_x = b_x;
    }

    public int getB_y() {
        return b_y;
    }

    public void setB_y(int b_y) {
        this.b_y = b_y;
    }

    public int getC_x() {
        return c_x;
    }

    public void setC_x(int c_x) {
        this.c_x = c_x;
    }

    public int getC_y() {
        return c_y;
    }

    public void setC_y(int c_y) {
        this.c_y = c_y;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "Triangle" + "[", "]")
                .add("id= " + id)
                .add("a_x=" + a_x)
                .add("a_y=" + a_y)
                .add("b_x=" + b_x)
                .add("b_y=" + b_y)
                .add("c_x=" + c_x)
                .add("c_y=" + c_y)
                .toString();
    }
}
