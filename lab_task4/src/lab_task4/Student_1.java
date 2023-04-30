package lab_task4;

import java.util.Scanner;

public class Student_1 {
    private String name;
    private int Id;
    private double cgpa;

    public Student_1(String name, int Id, double cgpa) {
        this.name = name;
        this.Id = Id;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void printInfo() {
        System.out.println("Name = " + this.name);
        System.out.println("ID = " + this.Id);
        System.out.println("CGPA = " + this.cgpa);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create first student
        System.out.println("Name of the first student ");
        String name1 = input.nextLine();
        System.out.println("Id of the first student ");
        int id1 = input.nextInt();
        System.out.println("Cgpa of the first student ");
        double cgpa1 = input.nextDouble();
        Student_1 s1 = new Student_1(name1, id1, cgpa1);
        input.nextLine();

        // Create second student
        System.out.println("Name of the second student ");
        String name2 = input.nextLine();
        System.out.println("Id of the second student ");
        int id2 = input.nextInt();
        System.out.println("Cgpa of the second student ");
        double cgpa2 = input.nextDouble();
        Student_1 s2 = new Student_1(name2, id2, cgpa2);

        // Print information for both students
        s1.printInfo();
        System.out.println();
        s2.printInfo();
    }
}