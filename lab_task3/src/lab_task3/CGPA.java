package lab_task3;
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Student's CGPA you want to insert? ");
        int n = input.nextInt();
        double[] array = new double[n];
        System.out.println("Enter " + n + " array elements :");
        for(int i=0; i<n; i++)

        {
            array[i] = input.nextDouble();
        }
        double small = array[0];
        double large = array[0];
        for (int i = 1; i < n; i++) 
        {
            if (array[i] < small) {
                small = array[i];
            }
            if (array[i] > large) {
                large = array[i];
            }
        }
        System.out.println("largest CGPA = " + large);
        System.out.println("Smallest CGPA = " + small);
        

    }
}
