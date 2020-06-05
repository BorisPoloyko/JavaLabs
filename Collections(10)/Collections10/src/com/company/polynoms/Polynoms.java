package com.company.polynoms;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

import com.company.dataReader.*;
public class Polynoms {
    private int deg;
    private HashMap<Integer, Integer> coeff = new HashMap<Integer, Integer>();

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public HashMap<Integer, Integer> getCoeff() {
        return coeff;
    }

    public void setCoeff(HashMap<Integer, Integer> coeff) {
        this.coeff = coeff;
    }

    public static boolean isPositive(int a){
        return a > 0;
    }

    public void setCoefficients(int deg) {
        for (int i = 0; i < deg; i++) {
            System.out.print("a0 = ");
            int coef = DataReader.readInt();
            coeff.put(i, coef);
            System.out.println();
        }
    }





}