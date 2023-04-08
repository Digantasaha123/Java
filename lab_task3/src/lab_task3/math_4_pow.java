package lab_task3;

import java.util.Scanner;

public class math_4_pow {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(" 2^" + i +" = " + (int)Math.pow(2,i));
        }

    }

}
