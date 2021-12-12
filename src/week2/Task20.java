package week2;

//  20.	Integers a and b are entered.
//      It is guaranteed that a does not exceed b.
//      Print all numbers on the segment from a to b that are exact squares.
//      If there are no such numbers, then you do not need to display anything.


import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = input.nextInt();
        System.out.print("Enter B: ");
        int b = input.nextInt();
        while (a > b) {
            System.out.print("Enter B greater than A: ");
            b = input.nextInt();
        }
        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= b/2; j++) {
                if (j * j <= b && j * j >= a) {
                    System.out.print(j * j + " ");
                }
            }
            break;
        }
    }
}
