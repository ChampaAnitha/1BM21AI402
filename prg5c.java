//write a java program to input n interger values and store in an array. if the user wants to print an element of the array given an index, if the index given by the user is greater than the array length, generate array out of bound exception and print valid message in the catch block

import java.util.Scanner;

public class ArrayExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = scanner.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Enter element " + (i+1) + ": ");
      array[i] = scanner.nextInt();
    }

    while (true) {
      System.out.println("Enter the index of the element you want to print (enter -1 to exit): ");
      int index = scanner.nextInt();
      if (index == -1) {
        break;
      }

      try {
        System.out.println("Element at index " + index + ": " + array[index]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: Index is out of bounds");
      }
    }
  }
}
