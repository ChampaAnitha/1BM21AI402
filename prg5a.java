//write a java program to perform division of 2 numbers, handle the exeception if denominator is 0

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        int numerator = scanner.nextInt();
        System.out.println("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Program is complelted");
        }
    }
}
