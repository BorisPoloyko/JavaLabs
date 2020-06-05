package com.company.matrix;

import com.company.datareader.DataReader;
import java.util.Random;

public class Matrix {

    public static void initMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matrix[" + Integer.toString(i + 1) + "][" + Integer.toString(j + 1) + "] : ");
                matrix[i][j] = DataReader.readValue();
            }
        }
    }
    public static void initRandomMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matrix[i][j] = (int)(Math.random() * (n + n  + 1) - n - 1);
            }
        }
    }


    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.print("\n");
        }
    }

    public static int[][] deleteZeroRows(int[][] matrix){
        boolean[] deleteThese = new boolean[matrix.length];
        int count = 0;

        int n = matrix.length;
        for(int i = 0; i < n; i++){
            boolean allZeros = true;
            for(int j = 0; j < n; j++){
                if (matrix[i][j] != 0){
                    allZeros = false;
                    break;
                }
            }
            deleteThese[i] = allZeros;
            if (allZeros){
                count++;
            }
        }
        if (count == 0){
            return matrix;
        }
        else if (count == matrix.length){
            return new int[0][0];
        }
        else{
            int[][] newMatrix = new int[n - count][n];
            int idx = -1;
            for(int i = 0; i < n; i++){
                if (!deleteThese[i]){
                    idx++;
                    newMatrix[idx] = matrix[i];
                }
            }
            return newMatrix;
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] transposed = new int[c][r];
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

}
