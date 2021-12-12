package week2;

//  19.	Print all numbers on the segment from a to b
//      that give the remainder of c when divided by d.
//      If such numbers do not exist, then you do not need to display anything.

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = input.nextInt();
        System.out.print("Enter B: ");
        int b = input.nextInt();
        while (b < a) {
            System.out.print("Enter B greater than A: ");
            b = input.nextInt();
        }
        System.out.print("Enter C: ");
        int c  = input.nextInt();
        System.out.print("Enter D: ");
        int d = input.nextInt();
        for (int i = a; i <=b; i++) {
            if (i % d == c) {
                System.out.print(i + " ");
            }
        }
    }
}
