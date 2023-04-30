import java.util.Scanner;

public class EqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("String - 1: ");
        String a = input.nextLine();
        System.out.print("String - 2: ");
        String b = input.nextLine();
        System.out.print("String - 3: ");
        String c = input.nextLine();

        if (a.equals(b)) {
            System.out.println("String 1 and String 2 are equal.");
        } else if (a.equals(c)) {
            System.out.println("String 1 and String 3 are equal.");
        } else if (b.equals(c)) {
            System.out.println("String 2 and String 3 are equal.");
        } else {
            System.out.println("No strings are equal.");
        }
    }
}