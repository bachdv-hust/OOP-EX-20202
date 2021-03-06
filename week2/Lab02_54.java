package com.company;

import java.util.Scanner;

public class Lab02_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter input n : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for( int  j = 0; j < (n - 1 - i); j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (2 * i + 1); k++){
                System.out.print("*");
            }
            for( int  j = 0; j < (n - 1 - i); j++){
                System.out.print(" ");
            }
            System.out.print("\n");

        }
    }
}
