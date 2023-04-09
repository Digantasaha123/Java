import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("String - 1: ");
        String a = input.nextLine();
        System.out.print("String - 2: ");
        String b = input.nextLine();
        System.out.print("String - 3: ");
        String c = input.nextLine();

        String x = a;
        if (b.compareTo(x) > 0) {
            x = b;
        }
        if (c.compareTo(x) > 0) {
            x = c;
        }

        System.out.println("The longest string is: " + x);
    }
}