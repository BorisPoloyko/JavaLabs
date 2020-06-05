package com.company;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 * @author Boris Poloyko
 *
 * @since 13.02.2020
 *
 * */
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the amount of elements: ");
        int n = DataReader.readNumber();
        int[] array = new int [n];
        com.company.arrays.Arrays.fillArray(array);
        com.company.arrays.Arrays.displayArray(array);
        System.out.println(Digits.findDiffDigits(array));
        Calendar calendar = new GregorianCalendar(2020, 1 , 13);
        Date date = calendar.getTime();
        System.out.println("Дата получения " + date.toString());
        Date date1 = new Date();
        System.out.println("Дата сдачи " + date1.toString());
        System.out.print("Разработчик Полойко Борис");
    }
}
