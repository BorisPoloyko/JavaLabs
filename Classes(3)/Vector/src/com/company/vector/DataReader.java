package com.company.vector;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {

    public static int intReader(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        }

        return number;
    }

}
