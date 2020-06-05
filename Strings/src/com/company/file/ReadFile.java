package com.company.file;

import java.util.Scanner;
import java.io.*;

public class ReadFile {
    public static String[] getLines(String fileName) throws IOException {
        Scanner scan = null;
        int num = StringFiles.numStrings(fileName);
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

}