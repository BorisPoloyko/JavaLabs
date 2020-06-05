package com.company;

import com.company.bus.Bus;
import com.company.input.ValueReader;
import com.company.menu.Menu;
import sun.awt.SunHints;


public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the amount of buses: ");
        int n = ValueReader.intReader();
        Bus[] array = Bus.createArray(n);
        array = Bus.fillArray(array, n);
        while(true){
            int key = Menu.menu();
            if (key == 5)
            {
                return;
            }

            switch(key){
                case 1:
                    Bus.displayArray(array, n);
                    break;
                case 2:
                    System.out.print("Enter the age: ");
                    int age = ValueReader.intReader();
                    Bus.displayByAge(array, age, n);
                    break;
                case 3:
                    System.out.print("Enter the route: ");
                    int route = ValueReader.intReader();
                    Bus.displayByRoute(array, route, n);
                    break;
                case 4:
                    System.out.print("Enter the distance: ");
                    int km = ValueReader.intReader();
                    Bus.displayByKilometers(array, km, n);
                    break;
            }
        }

    }
}
