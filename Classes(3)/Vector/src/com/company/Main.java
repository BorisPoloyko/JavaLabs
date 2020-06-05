package com.company;

import com.company.menu.Menu;
import com.company.vector.DataReader;
import com.company.vector.Vector;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the amount of vectors: ");
        int m = DataReader.intReader();
        System.out.print("Enter the dimension: ");
        int n = DataReader.intReader();
        Vector[] array = Vector.createArray(m);
        array = Vector.fillArray(array, n);
        Vector.displayArray(array);
        while(true) {
            int key = Menu.menu();
            if (key == 5) {
                return;
            }
            switch (key) {
                case 1:
                    Vector.displayArray(array);
                    break;
                case 2:
                    Vector.displayDot(array);
                    break;
                case 3:
                    Vector.displayLength(array);
                    break;
                case 4:
                    Vector.displayAngles(array);
                    break;
            }
        }
    }
}
