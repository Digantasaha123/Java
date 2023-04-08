
package lab_task3;

import java.util.Scanner;

public class math_5_area_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, area;
        System.out.println("Enter the radius of the circle");
        r = input.nextDouble();
        area = Math.PI * Math.pow(r, 2);
        System.out.println("Area of the circle is " + area);
    }
}
