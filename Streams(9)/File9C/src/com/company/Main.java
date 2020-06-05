package com.company;

import java.io.*;
import java.util.Scanner;

import com.company.dataReader.*;
import com.company.lines.*;
import java.util.Scanner.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileOut = "/Users/larisapoloyko/Desktop/output/output.txt";
        String fileIn = "/Users/larisapoloyko/Desktop/input.txt";


        System.out.print("Enter m, number of last words: ");
        int m = DataReader.readNumber();
        System.out.print("Enter n, number of last lines: ");
        int n = DataReader.readNumber();
        Scanner scan = null;
        try {

            FileReader fr = new FileReader(fileIn);
            BufferedReader varRead = new BufferedReader(fr);
            scan = new Scanner(fr);
            int num = countLines.numStrings(fileIn);
            String[] lines = new String[num];
            for (int i = 0; i < num; i++) {
                lines[i] = varRead.readLine();
            }
            varRead.close();
            try {
                //создаем новую директорию
                File file = new File(fileOut);
                try{
                    file.getParentFile().mkdirs();
                    file.createNewFile();
                }
                catch(IOException ex){
                    System.out.print(ex.getMessage());
                }

                FileWriter fw = new FileWriter(fileOut);
                for (int i = lines.length - n; i < lines.length; i++) {
                    String[] curWords = null;
                    curWords = lines[i].split(" ");
                    for (int j = curWords.length - m; j < curWords.length; j++) {
                        if(Character.compare(curWords[j].charAt(curWords[j].length() - 1), '.') == 0){
                            curWords[j] = curWords[j].replace(".", "");
                        }
                        fw.write(curWords[j]);
                        fw.write(" ");
                    }

                    fw.write("\n");
                }
                fw.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        catch(IOException e){
            e.getMessage();
        }
    }
}
