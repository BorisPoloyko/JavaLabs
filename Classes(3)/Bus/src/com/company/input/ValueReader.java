package com.company.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValueReader {
    public static int intReader(){
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

    public static String stringReader(){
        Scanner scanner = new Scanner(System.in);
        String str = "a";
        if(str.matches("[a-zA-Z]+")){
            str = scanner.nextLine();
        }
        else{
            throw new InputMismatchException();
        }
        return str;
    }

    public static double doubleReader(){
        double value;
        Scanner scan = new Scanner( System.in );

        System.out.print("Enter a double:");
        value = scan.nextDouble();
        return value;
    }


}
