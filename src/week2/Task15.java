package week2;

//  15.	For a given natural N print the smallest integer k that`
//        Math.pow (2,k)≥N.(You can not use Math.pow())


import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number! ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N/2; i++) {
            while (i * i < N) {
                i+=1;
            }
            System.out.println(i);
            break;
        }
    }
}
