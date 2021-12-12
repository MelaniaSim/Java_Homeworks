package week2;

import java.util.Scanner;

//  Input from console int a and int b,
//  if a and b corresponds for following requirements print “Both a and b legal”,
//  if any of them does not correspond print about it like this “a is legal b is illegal ''.
//  or vice versa
//•	a is not a multiple of 5 but b is a multiple of 5
public class Task6 {

        // 1. a > 10 and b is not equal to 10

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text_1 = "1st N";
        System.out.println(text_1);
        int number_1 = scanner.nextInt();
        String text_2 = "2nd N";
        System.out.println(text_2);
        int number_2 = scanner.nextInt();
        if (number_1 > 10 && number_2 != 10) {
            System.out.println("Both " + text_1 + " and " + text_2 + " are legal!");
        } else if (number_1 > 10 && number_2 == 10) {
            System.out.println(text_1 + " is legal, but " + text_2 + " is illegal!");
        } else if (number_1 < 10 && number_2 != 10) {
            System.out.println(text_2 + " is legal, but " + text_1 + " is illegal!");
        } else {
            System.out.println("Both " + text_1 + " and " + text_2 + " are illegal!");
        }

//        // 2. both a and b is positive

        System.out.println();
        String text_3 = "1st N";
        System.out.println(text_3);
        int number_3 = scanner.nextInt();
        String text_4 = "2nd N";
        System.out.println(text_4);
        int number_4 = scanner.nextInt();
        if (number_3 > 0 && number_4 > 0) {
            System.out.println("Both " + text_3 + " and " + text_4 + " are legal!");
        } else if (number_3 > 0 && number_4 < 0) {
            System.out.println(text_3 + " is legal, but " + text_4 + " is illegal!");
        } else if (number_3 < 0 && number_4 > 0) {
            System.out.println(text_4 + " is legal, but " + text_3 + " is illegal!");
        } else {
            System.out.println("Both " + text_3 + " and " + text_4 + " are illegal!");
        }

        // 3. both a and b is negative

        System.out.println();
        String text_5 = "1st N";
        System.out.println(text_5);
        int number_5 = scanner.nextInt();
        String text_6 = "2nd N";
        System.out.println(text_6);
        int number_6 = scanner.nextInt();
        if (number_5 < 0 && number_6 < 0) {
            System.out.println("Both " + text_5 + " and " + text_6 + " are legal!");
        } else if (number_5 < 0 && number_6 > 0) {
            System.out.println(text_5 + " is legal, but " + text_6 + " is illegal!");
        } else if (number_5 > 0 && number_6 < 0) {
            System.out.println(text_6 + " is legal, but " + text_5 + " is illegal!");
        } else {
            System.out.println("Both " + text_5 + " and " + text_6 + " are illegal!");
        }

        // 4. a > 10 b < 1 both of them are odd

        System.out.println();
        String text_7 = "1st N";
        System.out.println(text_7);
        int number_7 = scanner.nextInt();
        String text_8 = "2nd N";
        System.out.println(text_8);
        int number_8 = scanner.nextInt();
        if (number_7 % 2 != 0 && number_8 % 2 != 0) {
            if (number_7 > 10 && number_8 < 0) {
                System.out.println("Both " + text_7 + " and " + text_8 + " are legal and odd!");
            } else if (number_7 > 10 && number_8 > 0) {
                System.out.println(text_7 + " is legal, but " + text_8 + " is illegal, but both are odd!");
            } else if (number_7 < 10 && number_8 < 0) {
                System.out.println(text_8 + " is legal, but " + text_7 + " is illegal, but both are odd!");
            } else {
                System.out.println("Both " + text_7 + " and " + text_8 + " are illegal, but odd!");
            }
        } else if (number_7 % 2 != 0 && number_8 % 2 == 0) {
            if (number_7 > 10 && number_8 < 0) {
                System.out.println("Both " + text_7 + " and " + text_8 + " are legal, but one of them is even: " + number_8 + "!");
            } else if (number_7 > 10 && number_8 > 0) {
                System.out.println(text_7 + " is legal and odd, but " + text_8 + " is illegal and even!");
            } else if (number_7 < 10 && number_8 < 0) {
                System.out.println(text_8 + " is legal, but even, but " + text_7 + " is illegal and odd!");
            } else {
                System.out.println("Both " + text_7 + " and " + text_8 + " are illegal, and one of them is even: " + number_8 + "!");
            }
        } else if (number_7 % 2 == 0 && number_8 % 2 != 0) {
            if (number_7 > 10 && number_8 < 0) {
                System.out.println("Both " + text_7 + " and " + text_8 + " are legal, but one of them is even: " + number_7 + "!");
            } else if (number_7 > 10 && number_8 > 0) {
                System.out.println(text_7 + " is legal and even, but " + text_8 + " is illegal and odd!");
            } else if (number_7 < 10 && number_8 < 0) {
                System.out.println(text_8 + " is legal and odd, but " + text_7 + " is illegal, but odd!");
            } else {
                System.out.println("Both " + text_7 + " and " + text_8 + " are illegal, and one of them is even: " + number_7 + "!");
            }
        }else {
            if (number_7 > 10 && number_8 < 0) {
                System.out.println("Both " + text_7 + " and " + text_8 + " are legal, but none of them is odd!");
            } else if (number_7 > 10 && number_8 > 0) {
                System.out.println(text_7 + " is legal, but " + text_8 + " is illegal. None of them is odd!");
            } else if (number_7 < 10 && number_8 < 0) {
                System.out.println(text_8 + " is legal, but " + text_7 + " is illegal. None of them is odd!");
            } else {
                System.out.println("Both " + text_7 + " and " + text_8 + " are illegal, and none of them is odd!");
            }
        }

        // 5. a is a multiple of 5 OR b is a multiple of 5

        System.out.println();
        String text_9 = "1st N";
        System.out.println(text_9);
        int number_9 = scanner.nextInt();
        String text_10 = "2nd N";
        System.out.println(text_10);
        int number_10 = scanner.nextInt();
        if (number_9 % 5 == 0 || number_10 % 5 == 0) {
            System.out.println("Residual of " + number_9 + " / 5 = " + number_9%5 + ".\n" +
                    "Residual of " + number_10 + " / 5 = " + number_10%5 + ".");
        } else {
            System.out.println("None of them is a multiple of 5!\n" +
                    "Residual of " + number_9 + " / 5 = " + number_9%5 + ".\n" +
                    "Residual of " + number_10 + " / 5 = " + number_10%5 + ".");
        }

        //6. a is not a multiple of 5 but b is a multiple of 5

        System.out.println();
        String text_11 = "1st N";
        System.out.println(text_11);
        int number_11 = scanner.nextInt();
        String text_12 = "2nd N";
        System.out.println(text_12);
        int number_12 = scanner.nextInt();
        if (number_11 % 5 == 0 && number_12 % 5 != 0) {
            System.out.println(text_11 + " is a multiple of 5!\n" +
                    "Residual of " + number_11 + " / 5 = " + number_9%5 + ".\n" +
                    text_12 + " is not a multiple of 5!\n" +
                    "Residual of " + number_12 + " / 5 = " + number_10%5 + ".");
        } else {
            System.out.println("Incorrect Data!98");
        }
    }

    public static class Task15 {
    }
}
