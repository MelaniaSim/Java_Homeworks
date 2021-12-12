package week2;

//  23.	Given an integer number x
//      Find the smallest natural divisor of x other than 1 (2 <= x <= 30000).

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        while (x < 2 || x > 30000) {
            System.out.print("Please enter a number greater than or equal to 2 and less than or equal to 30000. ");
            x = input.nextInt();
        }
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
