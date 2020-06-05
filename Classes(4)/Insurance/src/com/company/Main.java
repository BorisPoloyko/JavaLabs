package com.company;

import com.company.dataReader.*;
import com.company.insurance.Insurance;
import com.company.menu.*;
import com.company.exception.*;
import com.company.*;
import com.company.sql.DataBase;
import com.company.sql.Requests;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws InsuranceException, InsurancePriceException, SQLException {
        System.out.print("Enter the overall amount of material insurances: ");
        int m = DataReader.intReader();
        System.out.print("Enter the amount of personal insurances: ");
        int p = DataReader.intReader();
        Insurance[] array = Insurance.createDerivative(m , p);
        array = Insurance.fillDerivative(array, m, p);
        Insurance.displayArray(array);
        DataBase dataBase = new DataBase();
        Requests.createTable(dataBase, array);
        while(true) {
            int key = Menu.menu();
            if (key == 5) {
                return;
            }
            switch (key) {
                case 1:
                    Insurance.displayArray(array);
                    break;
                case 2:
                    System.out.println("The overall price is " + Insurance.calculatePrice(array));
                    break;
                case 3:
                    Insurance.sortByRisk(array);
                    break;
                case 4:
                    System.out.println("Enter starting and ending price, starting and ending risk chance: ");
                    System.out.println("\t Starting price: ");
                    double startPrice = DataReader.doublePriceReader();
                    System.out.println("\t Ending price: ");
                    double endPrice = DataReader.doublePriceReader();
                    System.out.println("\t Starting risk: ");
                    double startRisk = DataReader.doubleRiskReader();
                    System.out.println("\t Ending risk: ");
                    double endRisk = DataReader.doubleRiskReader();
                    Insurance.findByParameter(array, startPrice, endPrice, startRisk, endRisk);
                    break;
            }
        }
    }
}
