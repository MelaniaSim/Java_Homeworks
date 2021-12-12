package week2;

//  13.	The program will read three types of scores(quiz, mid-term, and final scores)
//      and determine the grade based on the following rules:
//      -if the average score >= 80%                 =>grade=A
//      -if the average score >= 60% and <80% => grade=B
//      -if the average score>=40% and < 60% =>grade=C
//      -else.   =>grade=F

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quiz score! ");
        double quiz = scanner.nextDouble();
        while (quiz > 100 || quiz < 0) {
            System.out.print("Enter the quiz score! The score must be less than or equal 100 and greater than 0. ");
            quiz = scanner.nextDouble();
        }
        System.out.print("Enter the mid-term score! ");
        double mid_term = scanner.nextDouble();
        while (mid_term > 100 || mid_term < 0) {
            System.out.print("Enter the mid-term score! The score must be less than or equal 100 and greater than 0. ");
            mid_term = scanner.nextDouble();
        }
        System.out.print("Enter the final score! ");
        double final_score = scanner.nextDouble();
        while (final_score > 100 || final_score < 0) {
            System.out.print("Enter the final score! The score must be less than or equal 100 and greater than 0. ");
            final_score = scanner.nextDouble();
        }
        double average_score = (quiz + mid_term + final_score)/3;
        if (average_score >= 80) {
            System.out.println("The average score is " + average_score + ". The grade is A! ");
        } else if (average_score >= 60) {
            System.out.println("The average score is " + average_score + ". The grade is B! ");
        } else if (average_score >= 40) {
            System.out.println("The average score is " + average_score + ". The grade is C! ");
        } else {
            System.out.println("The average score is " + average_score + ". The grade is F! ");
        }
    }
}
