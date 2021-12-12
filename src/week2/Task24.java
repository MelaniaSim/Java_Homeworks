package week2;

//  24.	Given an integer number x
//      Print all natural divisors of the number x in ascending order
//      (including 1 and the number itself).

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long x = input.nextLong();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}