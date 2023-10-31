package week8;

import java.util.Scanner;

/**
 * Write a programme in java to display the pattern like a diamond.
 * use of While loop
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 *   ***********
 *  *************
 *   ***********
 *    *********
 *     *******
 *      *****
 *       ***
 *        *
 */

public class Prog14_DisplayDiamond {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows (odd number): ");
            int numRows = scanner.nextInt();
            scanner.close();

            if (numRows % 2 == 0) {
                System.out.println("Please enter an odd number of rows.");
                return;
            }

            int spaces = numRows / 2;
            int stars = 1;

            int row = 1;
            while (row <= numRows) {
                // Print spaces
                int spaceCount = 1;
                while (spaceCount <= spaces) {
                    System.out.print(" ");
                    spaceCount++;
                }

                // Print stars
                int starCount = 1;
                while (starCount <= stars) {
                    System.out.print("*");
                    starCount++;
                }

                System.out.println();

                if (row <= numRows / 2) {
                    spaces--;
                    stars += 2;
                } else {
                    spaces++;
                    stars -= 2;
                }

                row++;
            }
        }
    }


