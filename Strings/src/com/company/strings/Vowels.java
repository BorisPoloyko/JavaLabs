package com.company.strings;

import com.company.file.ReadFile;

import java.io.IOException;

public class Vowels {
    public static int moreVowels(String sentence){
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.toLowerCase().charAt(i) == 'a' || sentence.toLowerCase().charAt(i) == 'o' || sentence.toLowerCase().charAt(i) == 'i' || sentence.toLowerCase().charAt(i) == 'u' || sentence.toLowerCase().charAt(i) == 'e'){
                vowels++;
            }
            else if (Character.isLetter(sentence.charAt(i)) && !(sentence.toLowerCase().charAt(i) == 'a' || sentence.toLowerCase().charAt(i) == 'o' || sentence.toLowerCase().charAt(i) == 'i' || sentence.toLowerCase().charAt(i) == 'u' || sentence.toLowerCase().charAt(i) == 'e')){
                consonants++;
            }
        }
        if(vowels == consonants){
            return 0;
        }
        if (vowels > consonants){
            return 1;
        }
        return -1;
    }
    public static void resultPrint(int res){
        if(res == 0){
            System.out.println("The amount of vowels and consonants is equal");
            return;
        }
        if(res == 1){
            System.out.println("The amount of vowels is greater");
            return;
        }
        System.out.println("The amount of vowels is lesser");
    }
    public static void result(String fileName) throws IOException {
        String[] lines = ReadFile.getLines(fileName);
        int count = 1;
        for(String i:lines){
            String[] sentences = i.split("[.!?]\\s*");
            for(String j:sentences){
                System.out.print("The " + count + " sentence: ");
                resultPrint(moreVowels(j));
                count++;
            }
        }
    }

}
