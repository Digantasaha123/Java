package lab_task3;
import java.util.Scanner;
import java.lang.Math;
public class math_2_max_min {
   

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ") ;
   
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int minn = Math.min(Math.min(x,y),z);
        int maxx = Math.max(Math.max(x,y),z);
        System.out.println("Minimum number = "+ minn);
        System.out.println("Maximum number = " +maxx);

    }
   
    
}
