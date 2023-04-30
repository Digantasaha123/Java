package lab_task4;

import java.util.Scanner;

public class Mobile {
    private String modelName;
    private String brand;
    private int code;
    private double price;

    public Mobile(String modelName, String brand, int code, double price) {
        this.modelName = modelName;
        this.brand = brand;
        this.code = code;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Brand: " + brand);
        System.out.println("Code: " + code);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of mobiles: ");
        int N = input.nextInt();
        input.nextLine();
        
        Mobile[] mobiles = new Mobile[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Model name  of mobile " + (i + 1) + ": ");
            String modelName = input.nextLine();
            System.out.print("Brand of mobile " + (i + 1) + ": ");
            String brand = input.nextLine();
            System.out.print("Code of mobile " + (i + 1) + ": ");
            int code = input.nextInt();
            System.out.print("Price of mobile " + (i + 1) + ": ");
            double price = input.nextDouble();
            input.nextLine();
            System.out.println("");
            mobiles[i] = new Mobile(modelName, brand, code, price);
        }

        for (Mobile mobile : mobiles) {
            mobile.printInfo();
            System.out.println();
            
        }
    }
}