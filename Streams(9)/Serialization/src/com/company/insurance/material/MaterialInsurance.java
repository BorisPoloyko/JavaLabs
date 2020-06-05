package com.company.insurance.material;
import com.company.insurance.*;

import java.util.StringJoiner;

public class MaterialInsurance extends Insurance {

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
        return new StringJoiner(", ", MaterialInsurance.class.getSimpleName() + "[", "]")
                .add("price=" + (super.price + super.comission))
                .add("riskChance=" + super.riskChance)
                .toString();
    }

    public MaterialInsurance(double price, double riskChance) {
        super(price, riskChance);
    }
}
