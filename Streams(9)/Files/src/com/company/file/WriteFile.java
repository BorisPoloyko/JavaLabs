package com.company.file;

import com.company.vowels.Vowwels;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeIntoFile(String fileNames) {
        try {
            String[] files = ReadFile.getLines(fileNames);

            String[] lines = ReadFile.getLines(files[0]);
            FileWriter fw = new FileWriter(files[1]);
            for (int i = 0; i < lines.length; i++) {
                String[] curWords = null;
                curWords = lines[i].split(" ");
                for (int j = 0; j < curWords.length; j++) {
                    if (Vowwels.startVowel(curWords[j])) {
                        fw.write(curWords[j]);
                        fw.write(" ");
                    }
                }
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}