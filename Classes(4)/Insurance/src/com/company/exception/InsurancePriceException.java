package com.company.exception;

public class InsurancePriceException  extends Exception{
    private double price;
    public double getPrice() {return price;}
    public InsurancePriceException (String message, double pr){
        super(message);
        price = pr;
    }
}
