package com.company;

import com.company.DataReader.DataReader;
import com.company.DataReader.FileDataReader;
import com.company.birds.Cuckoo;
import com.company.birds.Bird;
import com.company.birds.NestBird;
import com.company.FileWriter.*;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        String fileIn ="/Users/larisapoloyko/Desktop/bird.txt";
        String fileOut = "/Users/larisapoloyko/Desktop/birds_result.txt";
        String[] infoLine = FileDataReader.getLines(fileIn);
        String[] info = infoLine[0].split(" ");
        NestBird NestBird = new NestBird(10, "F336");
        NestBird NestBird1 = new NestBird(Integer.parseInt(info[0]), info[1]);
        String[] birds = new String[] {NestBird.toString(), NestBird1.toString()};
        WriteFile.writeIntoFile(fileOut, birds);
    }
}
