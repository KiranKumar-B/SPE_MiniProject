package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScientificCalculator {
    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class);
    public static void main(String[] args) {
        logger.debug("Start_Program");
        logger.debug("Statement_1");
        logger.debug("Statement_2");
        logger.debug("Statement_3");
        logger.debug("Statement_4");
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
                    logger.debug("Inside Square root case");
                    System.out.print("Enter a number: ");
                    double num1 = scanner.nextDouble();
                    logger.debug("Accepted Input");
                    System.out.println("Square root of " + num1 + " is " + Math.sqrt(num1));
                    logger.debug("Exiting square root case");
                    break;
                case 2:
                    logger.debug("Inside Factorial case");
                    System.out.print("Enter a number: ");
                    int num2 = scanner.nextInt();
                    logger.debug("Accepted Input");
                    System.out.println("Factorial of " + num2 + " is " + factorial(num2));
                    logger.debug("Exiting Factorial case");
                    break;
                case 3:
                    logger.debug("Inside natural log case");
                    System.out.print("Enter a number: ");
                    double num3 = scanner.nextDouble();
                    logger.debug("Accepted Input");
                    System.out.println("Natural logarithm of " + num3 + " is " + Math.log(num3));
                    logger.debug("Exiting natural log case");
                    break;
                case 4:
                    logger.debug("Inside power case");
                    System.out.print("Enter a number: ");
                    double num4 = scanner.nextDouble();
                    logger.debug("Accepted Input");
                    System.out.print("Enter a power: ");
                    logger.debug("Accepted power");
                    double pow = scanner.nextDouble();
                    System.out.println(num4 + " raised to the power of " + pow + " is " + Math.pow(num4, pow));
                    logger.debug("Exiting power case");
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
