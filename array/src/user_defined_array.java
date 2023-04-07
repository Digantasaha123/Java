import java.util.Scanner;

public class user_defined_array {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = input.nextInt();
        int[] array = new int [n];

        for(int i:array)
        {
            array[i] = input.nextInt();
        }

        for(int i:array)
        {
            System.out.println( array[i] + " ");
        }
    }
}
