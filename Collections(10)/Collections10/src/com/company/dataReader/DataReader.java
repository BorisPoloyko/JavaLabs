package com.company.dataReader;

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

}
