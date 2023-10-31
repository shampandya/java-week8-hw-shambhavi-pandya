package week8;

import java.util.Scanner;

public class Prog9_FibonacciSeq {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();
        scanner.close();

        int first = 1;
        int second = 1;

        System.out.print(first + " ");

        if (n > 1) {
            System.out.print(second + " ");
        }

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}

