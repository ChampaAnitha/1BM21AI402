//write a java program to design a simple calculator using switch statement, handle arithmetic exceptions whereever necessary

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double num1 = scanner.nextDouble();
    System.out.println("Enter the second number: ");
    double num2 = scanner.nextDouble();
    System.out.println("Enter the operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    try {
      double result;
      switch(operator) {
        case '+':
          result = num1 + num2;
          break;
        case '-':
          result = num1 - num2;
          break;
        case '*':
          result = num1 * num2;
          break;
        case '/':
          result = num1 / num2;
          break;
        default:
          System.out.println("Invalid operator");
          return;
      }
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: Cannot divide by 0");
    }
  }
}
