package com.company.exception;

public class InsuranceException extends Exception{
    private double chance;
    public double getChance() {return chance;}
    public InsuranceException (String message, double chan){
        super(message);
        chance = chan;
    }

}
