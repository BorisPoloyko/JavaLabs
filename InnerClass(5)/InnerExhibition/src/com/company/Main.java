package com.company;
import  com.company.exhibition.*;
import java.util.GregorianCalendar;
import  java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Exhibition exhibition = new Exhibition("Impressionists of Europe"){
            @Override
            public void status(){
                System.out.print("The exhibition is open!");
            }
        };
        exhibition.setInformation("De sternnacht", "Vincent van Gogh", 1, new GregorianCalendar(2020, Calendar.JANUARY , 25));
        System.out.print(exhibition.toString());
    }
}
