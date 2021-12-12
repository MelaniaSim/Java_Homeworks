package week2;

//  14.	Print all integer powers of two not exceeding N in ascending order.
//  Input N from console.
//  Example ` Input 50(You can not use Math.pow())
//            Output ` 1 2 4 8 16 32.


import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int N = scanner.nextInt();
        for (int i = 1; i<=N; i++) {
            System.out.print("Output: ");
            while (i <= N) {
                System.out.print(i + " ");
                i *= 2;
            }
        }
    }
}
