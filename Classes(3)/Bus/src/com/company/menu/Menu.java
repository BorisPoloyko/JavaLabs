package com.company.menu;

import com.company.input.ValueReader;

public class Menu {
    public static int menu(){
        int k;
        System.out.print("\n Enter the number - the mode of operations with array: \n 1 - DISPLAY ARRAY\n 2- DISPLAY BY AGE\n 3 - DISPLAY BY ROUTE\n 4 - DISPLAY BY DISTANCE\n 5 - EXIT\n");
        k = ValueReader.intReader();
        if ( k < 1 && k > 5){
            throw new ArithmeticException();
        }
        return k;
    }

}
