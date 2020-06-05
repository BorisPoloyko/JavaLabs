package com.company.insurance.personal;
import com.company.insurance.*;
import com.company.insurance.material.MaterialInsurance;

import java.util.StringJoiner;

public class PersonalInsurance extends Insurance {
    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getRiskChance() {
        return super.getRiskChance();
    }

    @Override
    public void setRiskChance(double riskChance) {
        super.setRiskChance(riskChance);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PersonalInsurance.class.getSimpleName() + "[", "]")
                .add("price=" + (super.price + super.comission))
                .add("riskChance=" + super.riskChance)
                .toString();
    }

    public PersonalInsurance(double price, double riskChance) {
        super(price, riskChance);
    }
}
