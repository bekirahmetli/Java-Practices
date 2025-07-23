package org.example;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // Get matrix dimensions from user
        System.out.println("Enter the number of rows : ");
        int row = scanner.nextInt();

        System.out.println("Enter the number of columns : ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];
        int[][] transpose = new int[column][row];

        // Read matrix elements from user
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpose calculation
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Original matrix printing
        System.out.println("Matris: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }

        // Transpose matrix printing
        System.out.println("Transpoze: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + "    ");
            }
            System.out.println();
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
