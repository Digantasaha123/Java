package lab_task4;

import java.util.Scanner;

public class Student_2 {

    private String name;
    private int id;
    private double cgpa;

    public Student_2(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Students -> ");
        int n = input.nextInt();
        Student_2[] student = new Student_2[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Enter Name : ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print((i + 1) + ". Enter ID no : ");
            int id = input.nextInt();
            System.out.print((i + 1) + ". Enter CGPA : ");
            double cgpa = input.nextDouble();
            student[i] = new Student_2(name, id, cgpa);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Name: " + student[i].name);
            System.out.println("ID: " + student[i].id);
            System.out.println("CGPA: " + student[i].cgpa);
            System.out.println();
        }
    }
}