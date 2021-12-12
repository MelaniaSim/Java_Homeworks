package week2;

// 8.	Input int values a and b from console
//•	if one of them is multiple of 7, and both positive, and a greater than b, print all odd values between them
//•	else print all even values between them

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st N! ");
        int num_1 = scanner.nextInt();
        System.out.print("2nd N! ");
        int num_2 = scanner.nextInt();
        if (num_1 % 7 == 0 || num_2 % 7 == 0 && num_1 > 0 && num_2 > 0 && num_1 > num_2) {
            System.out.println("Odd Numbers between " + num_2 + " and " + num_1 + ":");
            for (int i = num_2; i <= num_1; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Even Numbers between " + num_1 + " and " + num_2 + ":");
            for (int i = num_1; i <= num_2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
