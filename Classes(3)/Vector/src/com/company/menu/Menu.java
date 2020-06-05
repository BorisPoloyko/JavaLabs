package com.company.menu;

import com.company.vector.DataReader;

public class Menu {
    public static int menu(){
        int k;
        System.out.print("\n Enter the number - the mode of operations with array: \n 1 - DISPLAY ARRAY\n 2- DISPLAY SCALAR PRODUCT\n 3 - DISPLAY LENGTHS\n 4 - DISPLAY COSINES\n 5 - EXIT\n");
        k = DataReader.intReader();
        if ( k < 1 && k > 5){
            throw new ArithmeticException();
        }
        return k;
    }

}