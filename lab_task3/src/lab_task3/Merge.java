package lab_task3;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, m;

        //First array declaration
        System.out.println("Enter first array size");
        n1 =  input.nextInt();
        int[] array1 = new int[n1];   
        System.out.println("Enter " + n1 + " array values :  : ");
        
        for(int i = 0; i<n1; i++)
        {
            array1[i] = input.nextInt();
        }
        
        //Second array declaration
        System.out.println("Enter Second array size");
        n2 =  input.nextInt();
        int[] array2 = new int[n2];   
        System.out.println("Enter " + n2 + " array values :  : ");
        
        for(int i = 0; i<n2; i++)
        {
            array2[i] = input.nextInt();
        }
        System.out.println();

        //Merged array
        m = n1 + n2;
        int[] newArray = new int[m];
        int x = 0;
        for(int i=0; i<n1; i++)
        {
            newArray[x] = array1[i];
            x++;
        }
        for(int i=0; i<n2; i++)
        {
            newArray[x] = array2[i];
         x++;
        }

        for(int i=0; i<m; i++)

        {
            System.out.print(newArray[i] + " ");
            }
            System.out.println();
    }
}
