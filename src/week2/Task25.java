package week2;

// 25. Given an integer number x
//     Print all natural divisors of the number x in ascending order
//     (including 1 and the number itself).


import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long x = input.nextLong();
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count += 1;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("All Natural Divisors Count of " + x + ": " + count);
    }
}
