package com.company.vector;

public class Operations {

    public static int dot(Vector a, Vector b){
        if (a.getLength() != b.getLength()){
            throw new ArrayIndexOutOfBoundsException();
        }
        int result = 0;
        for (int i = 0; i < a.getLength(); i++){
            result += a.getElement(i) * b.getElement(i);
        }
        return result;
    }

    public static double getLength(Vector a){
        return Math.sqrt(dot(a, a));
    }

    public static double getAngle(Vector a, Vector b){
        if (a.getLength() != b.getLength()){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(a.equals(b))
        {
            return 1.0;
        }
        return dot(a,b) / (getLength(a)*getLength(b));
    }

}
