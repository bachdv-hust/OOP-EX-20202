import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Nhap so thu 1 :");
        num1 = scanner.nextDouble();
        System.out.println("Nhap so thu 2 :");
        num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Tong : "+ sum );
        System.out.println("Hieu:"+ difference);
        System.out.println("Tich :" + product);
        System.out.println("Thuong :"+quotient);

    }
}
