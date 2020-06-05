package com.company;


import java.util.*;
import com.company.DataReader.*;
import com.company.geometry.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("N = ");
        int N  = DataReader.readInt();
        Map<Integer, Segment>  segments = new TreeMap<>();
        Segment[] segmentsArray= new Segment[N];
        for(int i = 0; i < N; i++){
            System.out.print("x_0 = ");
            double x0 = DataReader.readDouble();
            System.out.print("y_0 = ");
            double y0 = DataReader.readDouble();
            Point P1 = new Point(x0,y0);
            System.out.print("x_1 = ");
            double x1 = DataReader.readDouble();
            System.out.print("y_1 = ");
            double y1 = DataReader.readDouble();
            Point P2 = new Point(x1,y1);
            segmentsArray[0] = new Segment(P1, P2);
        }
        for()



    }
}
