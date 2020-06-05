package com.company.datareader;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader
{
    public static int readNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        }
        if (number <= 0) {
            throw new InputMismatchException();
        }
        return number;
    }
    public static int readValue(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        }
        return number;
    }
}

