package week2;

import java.util.Scanner;
import java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
//      3.	Compute area and perimeter of circle.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number greater than 0! ");
        int radius = scanner.nextInt();
        while (radius < 0) {
            System.out.println("Please, enter a number greater than 0! ");
            radius = scanner.nextInt();
        }
        double area = Math.PI * Math.pow(radius,2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
