package week2;

// 11.	Write a java program to find maximum from a given 3 integer numbers using ternary operator.
//      Input numbers from console.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number! ");
        int num_1 = scanner.nextInt();
        System.out.print("Enter the 2nd number! ");
        int num_2 = scanner.nextInt();
        System.out.print("Enter the 3rd number! ");
        int num_3 = scanner.nextInt();
        int max = num_1;
        if (max < num_2) {
            max = num_2;
        }
        if (max < num_3) {
            max = num_3;
        }
        System.out.println();
        System.out.println("The greatest number is " + max + "!");
    }
}
