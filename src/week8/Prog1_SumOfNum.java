package week8;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 */

public class Prog1_SumOfNum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);   // use scanner to get 10 input from user
            int sum = 0;
            int count = 0;

            while (count < 10) {
                System.out.print("Enter number #" + (count + 1) + ": ");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    sum = sum+number;
                    count++;
                } else {
                    System.out.println("Invalid Number");
                }
                scanner.nextLine(); // Move to the next line
            }

            System.out.println("The sum of the 10 valid numbers is: " + sum);
            scanner.close(); // Close the scanner when you're done with it.
        }
}
