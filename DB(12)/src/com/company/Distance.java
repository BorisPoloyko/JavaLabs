package com.company;


import java.util.regex.Matcher;

public class Distance {
    public static double distance(int a_x, int a_y, int b_x, int b_y){
        return  Math.sqrt( Math.pow((a_x - b_x),2) + Math.pow((a_y - b_y),2));
    }

    public static boolean isIsosceles(Triangle triangle){
        if( triangle.getA() == triangle.getB() || triangle.getB() == triangle.getC() || triangle.getA() == triangle.getC()){
            return true;
        }
        return false;
    }

    public static boolean isEquilateral(Triangle triangle){
        if(triangle.getA() == triangle.getB() && triangle.getB() == triangle.getC() && triangle.getB() == triangle.getC()){
            return true;
        }
        return false;
    }

    public static boolean isRight(Triangle triangle){
        if( Math.abs(Math.pow(triangle.getA(),2) + Math.pow(triangle.getB(),2) - Math.pow(triangle.getC(),2)) <= 0.01 ||  Math.abs(Math.pow(triangle.getB(),2) + Math.pow(triangle.getC(),2) - Math.pow(triangle.getA(),2)) <= 0.01 || Math.abs(Math.pow(triangle.getC(),2) + Math.pow(triangle.getA(),2) - Math.pow(triangle.getB(),2)) <= 0.01){
            return true;
        }
        return false;
    }

    public static boolean isGreater(double area, Triangle triangle){
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        double p = (a + b + c)/2;
        if (Double.compare(area, Math.sqrt(p*(p-a)*(p - b)*(p - c))) == -1){
            return true;
        }
        return false;
    }
}
