package week2;

//  16.	Print all integer numbers from 1 to N,
//      except that are multiple of 3(Input N from console).

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number! ");
        int numbers = input.nextInt();
        for (int i = 1; i <= numbers; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
