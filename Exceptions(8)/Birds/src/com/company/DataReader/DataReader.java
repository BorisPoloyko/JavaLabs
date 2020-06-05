package com.company.DataReader;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    public static int intReader(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        }
        try {
            if (number < 0) {
                throw new InputMismatchException();
            }
        }
        catch(Exception ex){
            System.out.print(ex.getMessage());
            number = 1;
        }

        return number;
    }

    public static String stringReader(){
        Scanner scanner = new Scanner(System.in);
        String str = "";
        if(str.matches("[a-zA-Z]+")){
            str = scanner.nextLine();
        }
        else{
            throw new InputMismatchException();
        }
        return str;
    }

    public static double doubleReader(){
        double value = 0;
        Scanner scanner = new Scanner(System.in );
        System.out.print("Enter a double:");
        if(scanner.hasNextInt()){
            value = scanner.nextDouble();
        }
        return value;
    }


}
