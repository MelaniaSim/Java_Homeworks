package week2;

import org.openqa.selenium.*;

// 6.	Generate and print random integer number between 2 to 7 (not using bound).

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt();
        while (randomNumber < 2) {

        }
        if (randomNumber >= 2 && randomNumber <=2) {
            System.out.println(randomNumber);
        }
    }
}
