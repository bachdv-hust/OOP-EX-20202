package com.company;

import java.util.Scanner;

public class Lab02_55 {
    public static String checkMonth(String month) {
        String list_month[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "January", "Jan", "Jan.",
                "February", "Feb", "Feb.", "March", "Mar", "Mar.", "April", "Apr", "Apr.", "May", "June", "Jun", "Jun.",
                "July", "Jul", "Jul.", "August", "September", "October", "November", "December", "Aug", "Aug.", "Sep",
                "Sep.", "Oct", "Oct.", "Nov", "Nov.", "Dec", "Dec."};
        for (String s : list_month) {
            if (month.equals(s) == true) {
                return month;
            }
        }

        return "invalid";
    }

    public static boolean checkYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return false;
    }

    public static int checkDate(String month, int year) {
        String month_has_31[] = {
                "1", "January", "Jan", "Jan.", "3", "March", "Mar", "Mar.", "5", "May", "July", "Jul", "Jul.", "August",
                "Aug", "Aug.", "October", "Oct", "Oct.", "December", "Dec", "Dec.", "7", "8", "10", "12"
        };
        String month_has_30[] = {
                "4", "6", "9", "11", "April", "Apr", "Apr.", "September", "Sep", "Sep.", "Nov", "Nov.", "November"
        };
        String monthFebruary[] = {"2", "February", "Feb", "Feb."};
        for (String s : month_has_31) {
            if (month.equals(s) == true) {
                return 31;
            }
        }
        for (String s : month_has_30) {
            if (month.equals(s) == true) {
                return 30;
            }
        }
        for (String s : monthFebruary) {
            if (month.equals(s) == true) {
                if (checkYear(year) == true) {
                    return 29;
                } else return 28;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        String month;
        do {
            System.out.print("Enter input month : ");
            month = sc.nextLine();
            if (checkMonth(month).equals("invalid") == true) {
                System.out.println("Please enter the correct format required ! Example :  Month 1 : 1 or January or Jan or Jan. ");
            }
        } while (checkMonth(month).equals("invalid") == true);
        do {
            System.out.print("Enter input year : ");
            year = sc.nextInt();
            if (year < 0) {
                System.out.println("Year > 0");
            }

        } while (year <= 0);
        System.out.println("Has : " + checkDate(month, year) + " days");

    }
}
