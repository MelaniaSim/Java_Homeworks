package week2;

//  21.	Enters 2 integer numbers : x and d from console.
//      Count and print one number - how many times the
//      digit d occurs in the representation of a natural number x.

import java.util.Scanner;
//import java.util.*

public class Task21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        System.out.print("Enter a digit: ");
        int digit = input.nextInt();
        int count = 0;
        while (number > 0) {
            long d = number % 10;
            number /= 10;
            if (d == digit) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
