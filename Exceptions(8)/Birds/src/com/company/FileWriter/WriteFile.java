package com.company.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeIntoFile(String fileOut, String[] str){

        try {
            FileWriter fw = new FileWriter(fileOut);
            for(int i = 0; i < str.length; i++){
                fw.write(str[i]);
                fw.append("\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
