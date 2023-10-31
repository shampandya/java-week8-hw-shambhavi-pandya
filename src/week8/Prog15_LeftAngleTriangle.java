package week8;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 *        *
 *      * *
 *    * * *
 *  * * * *
 * * * * * *
 */
public class Prog15_LeftAngleTriangle {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int numRows = scanner.nextInt();
            scanner.close();  //close the scanner

            for (int i = 1; i <= numRows; i++) {
                // Print spaces
                for (int j = 1; j <= numRows - i; j++) {
                    System.out.print("  ");
                }

                // Print stars
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
}


