package com.company.DataReader;

import java.util.Scanner;

public class DataReader {
    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        }

        return number;
    }
    public static double readDouble(){
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        if(scanner.hasNextDouble()){
            number = scanner.nextDouble();
        }

        return number;
    }
}
