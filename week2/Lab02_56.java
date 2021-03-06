package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab02_56 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Inter input n : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Enter input n > 0");
            }
        } while (n <= 0);
        System.out.println("Inter input number of array :");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            array.add(number);
        }
        Collections.sort(array);
        System.out.println("ArrayList sorted : ");
        for(int i : array){
            System.out.print(i + "\t");
        }


    }
}
