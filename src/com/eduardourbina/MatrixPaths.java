package com.eduardourbina;

import java.util.Scanner;

/*
 * Consider a maze mapped to a matrix with an upper left corner at coordinates (row, column) = (0,0).
 * Any movement must be increasing row or column direction. You must determine the number of distinct paths
 * through the maze. You will always start at position (0,0), the top left, and end up at(max(row)), (max(column))
 * the bottom right.
 * As an example, consider the following diagram where '1' indicates an open cell and '0' indicates blocked.
 * You can only travel through open cells, so no path can go through the cell at (0,2). There are two distinct.
 * */
public class MatrixPaths {

    public static void main(String[] args) {
        System.out.println("Please input number of rows: ");
        Scanner aRows = new Scanner(System.in);
        int numberRows = aRows.nextInt();
        System.out.println("Please input number of columns: ");
        Scanner aColumns = new Scanner(System.in);
        int numberColumns = aColumns.nextInt();

        int[][] a = new int[numberRows][numberColumns];
        int row = 0;
        for(int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberColumns; j++) {

                a[i][j] = oneTwo();
            }
        }

        // Print the array
        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberColumns; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println("");
        }

        int res = numberOfPaths(a);
        System.out.println(res);
    }

    public static int numberOfPaths(int[][] fullMatrix) {
        int rows = fullMatrix.length;
        int columns = fullMatrix[0].length;
        int[][] tempMatrix = new int[rows][columns];

        tempMatrix[0][0] = fullMatrix[0][0];

        for(int i = 1; i < columns; i++){
            if(tempMatrix[0][i-1] == 1 && fullMatrix[0][i] == 1)
                tempMatrix[0][i] = 1;
        }

        for(int i = 1; i < rows; i++){
            if(tempMatrix[i-1][0] == 1 && fullMatrix[i][0] == 1)
                tempMatrix[i][0] = 1;
        }

        for(int i = 1; i < rows; i++){
            for(int j = 1; j < columns; j++){
                if(fullMatrix[i][j] == 1)
                    tempMatrix[i][j] = (tempMatrix[i-1][j] + tempMatrix[i][j-1])%1000000007;
            }
        }


        return  tempMatrix[rows-1][columns-1];
    }

    static int oneTwo() {
        if(Math.random() <= 0.8)
            return 1;
        else
            return 0;
    }
}
