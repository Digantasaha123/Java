
package lab_task3;

import java.util.Scanner;
import java.lang.Math;
public class Sort {

    public static void main(String[] args) {
       Scanner input =  new Scanner(System.in);
        int n;
        System.out.println("How many Numbers you want to insert? ");
        n = input.nextInt();
        System.out.println("Enter " + n + " array elements : ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = input.nextInt();
        }
       
        int temp;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
                
                {
                    temp = arr[j];
                    if(arr[j]>arr[j+1])
                    {
                        temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1] = temp;
                    }
                }
        }
        
        System.out.println("Sorted array : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
       
        }
    
}
