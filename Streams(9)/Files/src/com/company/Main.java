package com.company;

import java.io.*;

import com.company.file.ReadFile;
import com.company.file.WriteFile;

public class Main {
    public static void main(String[] args){
        String files = "/Users/larisapoloyko/Desktop/fileNames.txt";
        WriteFile.writeIntoFile(files);
    }
}
