package lab_task3;
import java.util.Scanner;
public class math_1_abs_floor_ceil_round_sqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        double n = input.nextDouble();

        // Absolute value
        double absoluteValue = Math.abs(n);
        System.out.println("Absolute value: " + absoluteValue);

        // Floor value
        double floorValue = Math.floor(n);
        System.out.println("Floor value: " + floorValue);

        // Ceil value
        double ceilValue = Math.ceil(n);
        System.out.println("Ceil value: " + ceilValue);

        // Round value
        long roundValue = Math.round(n);
        System.out.println("Round value: " + roundValue);

        // Square root value
        double sqrtValue = Math.sqrt(n);
        System.out.println("Square root value: " + sqrtValue);
    }
}
