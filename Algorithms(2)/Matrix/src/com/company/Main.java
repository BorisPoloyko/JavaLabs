package com.company;

import com.company.matrix.Matrix;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the N: ");
        int n = com.company.datareader.DataReader.readNumber();
        int[][] array = new int [n][n];
        int [][] arrayRand = new int [n][n];
        Matrix.initMatrix(array, n);
        Matrix.initRandomMatrix(arrayRand, n);
        System.out.println("Matrix: ");
        Matrix.displayMatrix(array);
        System.out.println("Random matrix: ");
        Matrix.displayMatrix(arrayRand);
        System.out.println("With deleted zeros: ");
        Matrix.displayMatrix(Matrix.transpose(Matrix.deleteZeroRows(Matrix.transpose((Matrix.deleteZeroRows(array))))));
    }
}
