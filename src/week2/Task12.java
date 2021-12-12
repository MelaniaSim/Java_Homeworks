package week2;

//  12.	Given the String variable day holding the name of the
//  weekday Sunday, Monday, etc., set an int variable to 1, 2, etc.

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the weekday! ");
        String weekdays = scanner.next();
        weekdays = weekdays.substring(0,1).toUpperCase() + weekdays.substring(1).toLowerCase();
        switch (weekdays) {
            case "Sunday":
                System.out.println(1);
                break;
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("There is no such weekday!");
        }
    }
}
