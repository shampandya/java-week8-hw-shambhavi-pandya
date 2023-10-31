package week8;

import java.util.Scanner;

public class Prog5_PalindromeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = scanner.nextInt();

        boolean isPalindrome = isPalindrome(number);

        if (isPalindrome) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false; // Negative numbers cannot be palindromes
        }

        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;

    }
}