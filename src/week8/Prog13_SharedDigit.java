package week8;

import java.util.Scanner;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class Prog13_SharedDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (between 10 and 99): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number (between 10 and 99): ");
        int num2 = scanner.nextInt();
        scanner.close();

        if (hasSharedDigit(num1, num2)) {
            System.out.println("Both numbers have a shared digit.");
        } else {
            System.out.println("There is no shared digit between the numbers.");
        }
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false; // Numbers not within the specified range
        }

        int digit1ofNum1 = num1 % 10;
        int tensDigit1ofNum1 = num1 / 10;

        int digit1ofNum2 = num2 % 10;
        int tensDigit1ofNum2 = num2 / 10;

        return digit1ofNum1 == digit1ofNum2
                || digit1ofNum1 == tensDigit1ofNum2
                || tensDigit1ofNum1 == digit1ofNum2
                || tensDigit1ofNum1 == tensDigit1ofNum2;
    }
}


