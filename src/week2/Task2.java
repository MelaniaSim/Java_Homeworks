package week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Narrowing Primitive Conversion (Explicit)

        // Task 1.1 - Cast double to float, print both variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Explicit: From Double To Float! ");
        double num_double = scanner.nextDouble();
        float num_float = (float)num_double;
        System.out.println("Double: " + num_double);
        System.out.println("Float: " + num_float);


        // Task 1.2 - Cast float to long, print both variables
        System.out.println("2. Explicit: From Float To Long! ");
        float num_float_1 = scanner.nextFloat();
        long num_long = (long)num_float_1;
        System.out.println("Float: " + num_float_1);
        System.out.println("Long: " + num_long);

        // Task 1.3 - Cast long to int, print both variables
        System.out.println("3. Explicit: From Long To Int! ");
        long num_long_1 = scanner.nextLong();
        int num_int = (int)num_long_1;
        System.out.println("Long: " + num_long_1);
        System.out.println("Int: " + num_int);

        // Task 1.4 - Cast int to short, print both results
        System.out.println("4. Explicit: From Int To Short! ");
        int num_int_1 = scanner.nextInt();
        short num_short = (short)num_int_1;
        System.out.println("Int: " + num_int_1);
        System.out.println("Short: " + num_short);

        // Tsak 1.5 - Cast short to byte, print both results
        System.out.println("5. Explicit: From Short To Byte! ");
        short num_short_1 = scanner.nextShort();
        byte num_byte = (byte)num_short_1;
        System.out.println("Short: " + num_short_1);
        System.out.println("Byte: " + num_byte);
    }
}
