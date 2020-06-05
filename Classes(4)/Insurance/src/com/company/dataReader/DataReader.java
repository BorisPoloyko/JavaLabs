package com.company.dataReader;
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

    public static double doubleReader() {
        double value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextDouble();
        return value;
    }

    public static double doubleRiskReader() {
        double value;
        Scanner scanner = new Scanner(System.in);
        try {
            value = scanner.nextDouble();
            if (Double.compare(value, 0) < 0 || Double.compare(value,1.0) > 0) {
                throw new InputMismatchException();
            }
        }
        catch(InputMismatchException ex) {
            System.out.println(ex.getMessage());
            value = 1.0;
        }
        return value;
    }

    public static double doublePriceReader() {
        double value;
        Scanner scanner = new Scanner(System.in);
        try {
            value = scanner.nextDouble();
            if (Double.compare(value, 0) < 0 ) {
                throw new InputMismatchException();
            }
        }
        catch(InputMismatchException ex) {
            System.out.println(ex.getMessage());
            value = 100.0;
        }
        return value;
    }
}
