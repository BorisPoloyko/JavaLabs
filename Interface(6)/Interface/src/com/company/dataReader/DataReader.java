package com.company.dataReader;

import java.util.Scanner;

public class DataReader {

    public static int intReader() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }
        return number;
    }

    public static  String stringReader(){
        String inputString;
        Scanner scanner = new Scanner(System. in);
        inputString = scanner. nextLine();
        return inputString;
    }
}
