package com.company;

import com.company.dataReader.*;
import com.company.insurance.*;
import com.company.menu.*;
import com.company.serial.*;
import sun.awt.windows.ThemeReader;

import java.io.InvalidObjectException;

public class Main {

    public static void main(String[] args) {

        String file = "/Users/larisapoloyko/Desktop/insurance.data";
        System.out.print("Enter the overall amount of material insurances: ");
        int m = DataReader.intReader();
        System.out.print("Enter the amount of personal insurances: ");
        int p = DataReader.intReader();
        Insurance[] array = Insurance.createDerivative(m , p);
        array = Insurance.fillDerivative(array, m, p);
        Serialization sz = new Serialization();
        Insurance[] finalArray = array;
        new Thread(){
            public void run() {
                synchronized (file){
                    boolean b = sz.serialization(finalArray, file);
                }
            }
        }.start();

        Insurance[] finalArray1 = array;
        new Thread(){
            public void run(){
                Insurance[] res = null;
                try{
                    res = sz.deserialization(file);
                }catch(InvalidObjectException e){
                    e.printStackTrace();
                }
                Insurance.displayArray(res);
                Insurance.displayArray(finalArray1);
            }

        }.start();

        while(true) {
            int key = Menu.menu();
            if (key == 5) {
                return;
            }
            switch (key) {
                case 1:
                    Insurance.displayArray(array);
                    break;
                case 2:
                    System.out.println("The overall price is " + Insurance.calculatePrice(array));
                    break;
                case 3:
                    Insurance.sortByRisk(array);
                    break;
                case 4:
                    System.out.println("Enter starting and ending price, starting and ending risk chance: ");
                    System.out.println("\t Starting price: ");
                    double startPrice = DataReader.doublePriceReader();
                    System.out.println("\t Ending price: ");
                    double endPrice = DataReader.doublePriceReader();
                    System.out.println("\t Starting risk: ");
                    double startRisk = DataReader.doubleRiskReader();
                    System.out.println("\t Ending risk: ");
                    double endRisk = DataReader.doubleRiskReader();
                    Insurance.findByParameter(array, startPrice, endPrice, startRisk, endRisk);
                    break;
            }
        }
    }
}
