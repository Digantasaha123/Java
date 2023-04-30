import java.util.Scanner;

public class LowUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("string-1: ");
        String str1 = input.nextLine();
        System.out.print("String-2: ");
        String str2 = input.nextLine();
        System.out.println();
        
        System.out.println("Lower Case:");
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toLowerCase());
        System.out.println();
        System.out.println("Upper Case:");
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toUpperCase());
    }
}