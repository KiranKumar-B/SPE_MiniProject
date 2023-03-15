package org.example;

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function (sqrt)");
            System.out.println("2. Factorial function (factorial)");
            System.out.println("3. Natural logarithm (ln)");
            System.out.println("4. Power function (power)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Square root of " + num1 + " is " + Math.sqrt(num1));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Factorial of " + num2 + " is " + factorial(num2));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double num3 = scanner.nextDouble();
                    System.out.println("Natural logarithm of " + num3 + " is " + Math.log(num3));
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    double num4 = scanner.nextDouble();
                    System.out.print("Enter a power: ");
                    double pow = scanner.nextDouble();
                    System.out.println(num4 + " raised to the power of " + pow + " is " + Math.pow(num4, pow));
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
            System.out.println();
        } while (choice != 5);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
