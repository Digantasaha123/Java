package lab_task3;

public class math_3_Random {
    public static void main(String[] args) {
        int min = 0;
        int max = 200;
        int a = 5;
        System.out.println("The random numbers are : ");
        for (int i = 0; i < a; i++) {
            int n = (int)(Math.random() * (max - min + 1) + min);
            System.out.print(n  + " ");
        }
        
        }
    }
    

