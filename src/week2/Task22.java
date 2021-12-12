package week2;

//  22.	Given an integer number x.
//      Print the number consisting of the digits of the given number x in reverse order.
//      You do not need to output leading zeros.

public class Task22 {
    public static void main(String[] args) {
        int num = 2500;
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num/10    ;
        }
        System.out.println(reverse);
    }
}

