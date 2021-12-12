package week2;

//   9.	Given coordinates of two points in the coordinate plane.
//      Write java program to check if the points lie in the same plane?(quarter)
//          •	Print In the same quarter, else print Not in the same quarter.
//          •	Input 4 coordinates from console, all 4 coordinates != 0.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("X1 coordinate: ");
        int x1 = scanner.nextInt();
        System.out.print("Y1 coordinate: ");
        int y1 = scanner.nextInt();
        System.out.print("X2 coordinate: ");
        int x2 = scanner.nextInt();
        System.out.print("Y2 coordinate: ");
        int y2 = scanner.nextInt();
        System.out.print("x1: " + x1 + ", ");
        System.out.print("y1: " + y1 + ", ");
        System.out.print("x2: " + x2 + ", ");
        System.out.println("y2: " + y2 + "");
        while(x1 == 0 || y1 == 0 || x2 ==0 || y2 == 0) {
            System.out.println("Please enter coordinate less or greater than 0!");
            System.out.print("X1 coordinate: ");
            x1 = scanner.nextInt();
            System.out.print("Y1 coordinate: ");
            y1 = scanner.nextInt();
            System.out.print("X2 coordinate: ");
            x2 = scanner.nextInt();
            System.out.print("Y2 coordinate: ");
            y2 = scanner.nextInt();
            System.out.print("x1: " + x1 + ", ");
            System.out.print("y1: " + y1 + ", ");
            System.out.print("x2: " + x2 + ", ");
            System.out.println("y2: " + y2 + "");
        }
        if ((x1 > 0 && x2 > 0 && y1 > 0 && y2 > 0) ||
                (x1 > 0 && x2 > 0 && y1 < 0 && y2 < 0) ||
                (x1 < 0 && x2 < 0 && y1 > 0 && y2 > 0) ||
                (x1 < 0 && x2 < 0 && y1 < 0 && y2 < 0)) {
            System.out.println("The coordinates are in the same quarter!");
        } else {
            System.out.println("The coordinates are not in the same quarter!");
        }
    }
}
