
import java.util.Scanner;

public class ConcatStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("String-1: ");
        String str1 = input.nextLine();
        System.out.print("String-2: ");
        String str2 = input.nextLine();
        System.out.print("String-3: ");
        String str3 = input.nextLine();

        String result = str1 + " " + str2 + " " + str3;
        System.out.println("New String : " + result);
    }
}
