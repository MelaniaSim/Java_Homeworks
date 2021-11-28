package week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Widening Primitive Conversion (Implicit)

        // Task 1.1 - Cast byte to short type, print both variables
        Scanner scanner = new Scanner(System.in);
        byte num_byte = scanner.nextByte();
        short num_short;
        num_short = num_byte;
        System.out.println(num_byte);
        System.out.println(num_short);


        // Task 1.2 - Cast short to int type, print both variables
        short num_short_1 = scanner.nextShort();
        int num_int;
        num_int = num_short_1;
        System.out.println(num_short_1);
        System.out.println(num_int);

        // Task 1.3 - Cast int to long, print both variables
        int num_int_1 = scanner.nextInt();
        long num_long;
        num_long = num_int_1;
        System.out.println(num_int_1);
        System.out.println(num_long);

        // Task 1.4 - Cast long to float, print both variables
        long num_long_1 = scanner.nextLong();
        float num_float;
        num_float = num_long_1;
        System.out.println(num_long_1);
        System.out.println(num_float);

        // Tsak 1.5 - Cast float to double type, print both variables
        float num_float_1 = scanner.nextFloat();
        double num_double;
        num_double = num_float_1;
        System.out.println(num_float_1);
        System.out.println(num_double);
    }
}
