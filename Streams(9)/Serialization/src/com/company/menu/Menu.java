package com.company.menu;
import com.company.dataReader.*;

public class Menu {
    public static int menu(){
        int k;
        System.out.print("\n Enter the number - the mode of operations with derivative: \n 1 - DISPLAY DERIVATIVE\n 2 - CALCULATE THE PRICE\n 3 - SORT BY RISK\n 4 - FIND INSURANCE BY PARAMETER\n 5 - EXIT\n");
        k = DataReader.intReader();
        try {
            if (k < 1 && k > 5) {
                throw new Exception("Wrong menu elements!");
            }
        }
        catch (Exception ex){
            System.out.print(ex.getMessage());
            k = 1;
        }
        return k;
    }
}
