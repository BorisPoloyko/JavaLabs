package com.company.vowels;

public class Vowwels {
    public static boolean startVowel(String str){
        if (str.charAt(0) == 'a' || str.charAt(0) == 'e' ||str.charAt(0) == 'i' ||str.charAt(0) == 'o' ||str.charAt(0) == 'u' ||str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' || str.charAt(0) == 'O' || str.charAt(0) == 'U'){
            return true;
        }
        return false;
    }
}
