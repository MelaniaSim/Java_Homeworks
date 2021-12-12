package week2;

//  18.	Write a java program to print all even numbers from a given range,
//      from a to b. Input a and b from console.
//      Example` Input ` 2  - 5 Output ` 2 4

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num_1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num_2 = input.nextInt();
        if (num_1 <= num_2) {
            for (int i = num_1; i <= num_2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = num_2; i <= num_1; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
