package lab3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        LocalDate currentdate = LocalDate.now();
        this.day = currentdate.getDayOfMonth();
        this.month = currentdate.getMonthValue();
        this.year = currentdate.getYear();
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String input) throws ParseException {
        for (int i = input.length() - 1; i >= 0; i--) {
            if (Character.isLetter(input.charAt(i))) {
                StringBuilder sb = new StringBuilder(input);
                sb.deleteCharAt(i);
                sb.deleteCharAt(i - 1);
                input = sb.toString();
                break;
            }
        }
        Date date = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH).parse(input);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        this.day = cal.get(Calendar.DATE);
        this.month = cal.get(Calendar.MONTH) + 1;
        this.year = cal.get(Calendar.YEAR);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Error!");
        }
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Error!");
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void accept() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input date (example: JuLy 18th 2020):");
        String input = scanner.nextLine();

        for (int i = input.length() - 1; i >= 0; i--) {
            if (Character.isLetter(input.charAt(i))) {
                StringBuilder sb = new StringBuilder(input);
                sb.deleteCharAt(i);
                sb.deleteCharAt(i - 1);
                input = sb.toString();
                break;
            }
        }
        Date date = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH).parse(input);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        this.day = cal.get(Calendar.DATE);
        this.month = cal.get(Calendar.MONTH) + 1;
        this.year = cal.get(Calendar.YEAR);


    }

    public void print() {
        LocalDate currentdate = LocalDate.now();
        System.out.println(currentdate);
    }
}


public class TestDate{
    public static void main(String[] args) throws ParseException {
        System.out.println("Test1:");
        MyDate test1 = new MyDate();
        System.out.println(test1.getDay());
        System.out.println(test1.getMonth());
        System.out.println(test1.getYear());

        System.out.println("Test2:");
        MyDate test2 = new MyDate(3, 4, 2020);
        System.out.println(test2.getDay());
        System.out.println(test2.getMonth());
        System.out.println(test2.getYear());

        System.out.println("Test3: ");
        MyDate test3 = new MyDate("February 23rd 3002");
        System.out.println(test3.getDay());
        System.out.println(test3.getMonth());
        System.out.println(test3.getYear());

        System.out.println("Accept method: ");
        test1.accept();
        System.out.println(test1.getDay());
        System.out.println(test1.getMonth());
        System.out.println(test1.getYear());

        System.out.println("print method");
        test1.print();
    }
}