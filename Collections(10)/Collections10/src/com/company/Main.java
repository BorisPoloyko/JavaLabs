package com.company;

import com.company.dataReader.DataReader;
import com.company.polynoms.*;
import java.util.HashMap;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {
        HashMap<FirstOrSecond, Integer> coefficients = new HashMap<FirstOrSecond, Integer>();
        System.out.print("Deg = ");
        int deg = DataReader.readInt();
        //заполняем коэффициенты
        for(int i  = 0; i <= deg; i++){
            System.out.print(("a_") + i + (" = "));
            int curCoeff = DataReader.readInt();
            coefficients.put(new FirstOrSecond(i, 1), curCoeff);
            System.out.print(("b_") + i + (" = "));
            curCoeff = DataReader.readInt();
            coefficients.put(new FirstOrSecond(i, -1), curCoeff);
        }

        //выводим полиномы
        for(int i  = 0; i <= deg; i++){
            if(i == 0) {
                int coeffA = coefficients.get(new FirstOrSecond(i, 1));
                System.out.print("a = " + coeffA);
            }
            else{

                int coeffA = coefficients.get(new FirstOrSecond(i, 1));
                if(coeffA == 0){
                    continue;
                }
                System.out.print(" + "+ coeffA + "x^" + i);
            }
        }
        System.out.println();
        for(int i  = 0; i <= deg; i++){
            if(i == 0) {
                int coeffB = coefficients.get(new FirstOrSecond(i, -1));
                System.out.print("b = " + coeffB);
            }
            else{
                int coeffB = coefficients.get(new FirstOrSecond(i, -1));
                if(coeffB == 0){
                    continue;
                }
                System.out.print(" + "+ coeffB + "x^" + i);
            }

        }
        System.out.println();

        for(int i  = 0; i <= deg; i++){
            if(i == 0) {
                int coeffC = coefficients.get(new FirstOrSecond(i, -1)) + coefficients.get(new FirstOrSecond(i, 1));
                System.out.print("c = " + coeffC);
            }
            else{
                int coeffC = coefficients.get(new FirstOrSecond(i, -1)) + coefficients.get(new FirstOrSecond(i, 1));
                if(coeffC == 0){
                    continue;
                }
                System.out.print(" + " + coeffC + "x^" + i);
            }

        }
    }
}
