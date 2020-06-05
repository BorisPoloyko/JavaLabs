package com.company;

import com.company.clothes.*;

import javax.annotation.processing.SupportedSourceVersion;

public class Main {

    public static void main(String[] args) {
        Clothes costume = new Costume("M", "Blue");
        String costumerSize1 = "S";
        String costumerSize2 = "M";
        System.out.println(costume.ifFits(costumerSize1));
        System.out.println(costume.ifFits(costumerSize2));
    }
}