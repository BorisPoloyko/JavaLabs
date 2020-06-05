package com.company.DataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDataReader {

    public static String[] getLines(String fileName){
        Scanner scan = null;
        int num = numStrings(fileName);
        String[] lines = new String[num];
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader varRead = new BufferedReader(fr);
            scan = new Scanner(fr);
            for (int i = 0; i < num; i++) {
                lines[i] = varRead.readLine();
            }
            varRead.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    public static int numStrings(String fileName)  {
        String one;
        int num = 0;
        try {
            FileReader text = new FileReader(fileName);
            BufferedReader y = new BufferedReader(text);
            while ((one = y.readLine()) != null) {
                num++;
            }
            y.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return num;
    }

}
