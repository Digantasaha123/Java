import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of strings: ");
        int n = input.nextInt();
        input.nextLine();
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = input.nextLine();
        }

        Arrays.sort(strings);

        System.out.println("Strings in alphabetical order:");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}