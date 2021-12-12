package week2;

import java.util.Random;
public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("Random number is " + a);

        if (a < 0) {
            a = a * -1;
        }
        int b = a % (8 - 2) + 2;
        System.out.println("End number is " + b);
        System.out.println(7%5);
    }
}
