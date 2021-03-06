package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab02_57 {
    public static int[][] inputMatric(int n, int m) {
        int array[][] = new int[n][m];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = sc.nextInt();
            }
        }
        return array;

    }

    public static int[][] addMatric(int arr1[][], int arr2[][], int row, int col) {
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr;

    }

    public static void input(int array[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;


        do {
            System.out.print("Input row : ");
            row = sc.nextInt();
            if (row < 0) {
                System.out.println("row > 0");
            }
        } while (row < 0);
        do {
            System.out.print("Input col : ");
            col = sc.nextInt();
            if (col < 0) {
                System.out.println("col > 0");
            }
        } while (col < 0);
        int array1[][] = new int[row][col];
        int array2[][] = new int[row][col];
        int array[][] = new int[row][col];
        System.out.println("MATRIC 1 : ");
        array1 = inputMatric(row, col);
        System.out.println("MATRIC 2 : ");
        array2 = inputMatric(row, col);
        array = addMatric(array1, array2, row, col);
        input(array1, row, col);
        input(array2, row, col);
        input(array, row, col);


    }
}
