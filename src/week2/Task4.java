package week2;

//  5. Write a Java program to allow the user to input his/her age.
//  Then the program will show if the person is eligible to vote.
//  A person who is eligible to vote must be older than or equal to 18 years old.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your age! ");
        int age = scanner.nextInt();
        while (age < 0) {
            System.out.println("Please, enter your age! It must be greater than 0. ");
            age = scanner.nextInt();
        }
        if (age >= 18) {
            System.out.println("You are " + age + " and eligible to vote ;)");
        }
        else {
            int difference = 18 - age;
            System.out.println("You are not eligible to vote! You have " + difference + " years left to vote :(");
        }
    }
}
