package com.company.arrays;

public class Arrays {
    public static void fillArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(i + 1 + " number: ");
            array[i] = com.company.DataReader.readNumber();
        }
    }
    public static void displayArray(int [] array){
        for(int i:array)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
