package com.company.file;

import java.io.*;

public class StringFiles {
    public static int numStrings(String fileName) throws IOException {
        FileReader text = new FileReader(fileName);
        BufferedReader y = new BufferedReader(text);
        String one;
        int num = 0;
        while ((one = y.readLine()) != null) {
            num++;
        }
        y.close();
        return num;
    }
}
