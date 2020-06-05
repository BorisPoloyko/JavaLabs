package com.company.insurance;

import com.company.insurance.material.MaterialInsurance;
import com.company.insurance.personal.PersonalInsurance;
import com.company.dataReader.*;
import com.company.exception.*;

import java.util.InputMismatchException;
import java.util.StringJoiner;

public abstract class Insurance {
    protected double price;

    protected double riskChance;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRiskChance() {
        return riskChance;
    }

    public void setRiskChance(double riskChance) {
        this.riskChance = riskChance;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Insurance.class.getSimpleName() + "[", "]")
                .add("price=" + price)
                .add("riskChance=" + riskChance)
                .toString();
    }

    public static void displayArray(Insurance[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].toString());
        }
    }

    public static double calculatePrice(Insurance[] array){
        double res = 0;
        for (int i = 0; i < array.length; i++){
            res += array[i].getPrice();
        }
        return res;
    }

    public static void sortByRisk(Insurance[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j].getRiskChance() < array[j+1].getRiskChance())
                {
                    Insurance temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void findByParameter(Insurance[] array, double startPrice, double endPrice, double startRiskChance, double endRiskChance){
        try {
            if (Double.compare(startPrice, endPrice) > 0 || Double.compare(startRiskChance,endRiskChance) > 0){
                throw new InputMismatchException();
            }
        }
        catch (InputMismatchException ex){
            System.out.print(ex.getMessage());
        }
        for (int i = 0; i < array.length; i++){
            if (Double.compare(startPrice,array[i].getPrice()) < 0 && Double.compare(endPrice, array[i].getPrice()) > 0 && Double.compare(startRiskChance, array[i].getRiskChance()) < 0 && Double.compare(endRiskChance, array[i].getRiskChance()) > 0){
                System.out.println(array[i].toString());
            }
        }
    }

    public Insurance(double price, double riskChance) throws InsuranceException, InsurancePriceException{
        try {
            this.price = price;
            this.riskChance = riskChance;
            if(Double.compare(riskChance, 0) < 0 || Double.compare(riskChance, 1) > 0)
            {
                throw new InsuranceException("The chance is less then 0 or greater then 1", riskChance);
            }

            if (Double.compare(price, 0) < 0) {
                throw new InsurancePriceException("The price can't be negative!", price);
            }
        }
        catch(InsuranceException ex)
        {
            System.out.print(ex.getMessage());
            System.out.println(ex.getChance());
        }
        catch (InsurancePriceException ex)
        {
            System.out.print(ex.getMessage());
            System.out.println(ex.getPrice());
        }
    }

    public static Insurance[] createDerivative(int m, int p){
        Insurance[] array = new Insurance[m + p];
        return array;
    }

    public static Insurance[] fillDerivative(Insurance[] array, int m, int p) throws InsuranceException, InsurancePriceException{
        for (int i = 0; i < m; i++){
            System.out.println("Filling the " + (i + 1) + " material insurance: ");
            System.out.print("\t Enter the price of the insurance: ");
            double price = DataReader.doubleReader();
            System.out.print("\t Enter the chance of risk: ");
            double riskChance = DataReader.doubleReader();
            array[i] = new MaterialInsurance(price, riskChance);
        }
        for (int j = m, i = 0; j < p + m; j++, i ++){
            System.out.println("Filling the " + (i + 1) + " personal insurance: ");
            System.out.print("\t Enter the price of the insurance: ");
            double price = DataReader.doubleReader();
            System.out.print("\t Enter the chance of risk: ");
            double riskChance = DataReader.doubleReader();
            array[j] = new PersonalInsurance(price, riskChance);
        }
        return array;
    }
}
