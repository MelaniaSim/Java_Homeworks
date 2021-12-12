package week2;

//  17.	Write a Java Program to Compute the Sum of Digits in a given Integer.

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum_of_digits = 0;
        while (num > 0) {
            sum_of_digits = sum_of_digits + num % 10;
            num /= 10;
        }
        System.out.println(sum_of_digits);
    }
}
