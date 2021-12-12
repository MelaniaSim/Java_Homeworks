package week2;

//  10.	Given 3 real numbers a, b , c .Find all decisions for ax2 + bx + c = 0.
//      Print all decisions, if there is not a decision ,print “Can't be”.

import java.util.Scanner;
import java.lang.Math.*;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        double a = scanner.nextInt();
        System.out.print("Enter B: ");
        double b = scanner.nextInt();
        System.out.print("Enter C: ");
        double c = scanner.nextInt();
        double discriminant = Math.pow(b,2.) - (4.0  * a * c);
        double x_1 = 0;
        double x_2 = 0;
        if (a > 0.0 || a < 0.0) {
            if (discriminant > 0.0) {
                System.out.println("Discriminant is positive: " + discriminant);
                System.out.println("Hence Two Solutions! ");
                x_1 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
                x_2 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
                System.out.println("x1 is " + x_1);
                System.out.println("x2 is " + x_2);
            } else if (discriminant == 0.0) {
                System.out.println("Discriminant is Zero: " + discriminant);
                System.out.println("Hence One Solutions! ");
                x_1 = -b / (4.0 * a);
                System.out.println("x1 is equal x2: " + x_1);
            } else {
                System.out.println("Discriminant is Negative: " + discriminant);
                System.out.println("Hence No Real Solutions! ");
            }
        }else {
                System.out.println("This is a linear equation! ");
        }
    }
}
