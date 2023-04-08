package lab_task3;

import java.security.PublicKey;
import java.util.Scanner;

public class Search 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int t,n;
        int flag = 0;
        System.out.println("Total tese cases : ");
        t = input.nextInt();
        System.out.println("How many numbers you want to insert ? ");
        n =  input.nextInt();
        System.out.println("Enter " + n + " array elements");
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }

        for( int i = 0 ; i<t; i++)
        { System.out.print("Enter your Data to search : ");
            int key = input.nextInt();
           int res =  linearSearch(array, key);
            if(res == -1)
            {
                System.out.println(key + " not found in the Array");
            } 

            else System.out.println(key + " found at position " + res);
        }
       
    }

    public static int linearSearch(int[] array, int key)
    { 
        for(int i = 0; i< array.length; i++)
        {
            if(array[i] == key)
             return i;

        }

        
            return - 1;
    }
}
