package lab_task4;
import java.util.Scanner;

public class Student_1 {
    private String name;
    private int Id;
    private double cgpa; 

    public Student_1(String name, int Id, double cgpa)
    {
        this.name = name;
        this.Id = Id;
        this.cgpa= cgpa;
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
    
   public  void printInfo()
    {
        System.out.println("Name = " + this.name);
        System.out.println("ID = " + this.Id);
        System.out.println("CGPA = " + this.cgpa);
    }
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Name of the first student ");
        String n1 = input.nextLine();
        System.out.println("Id of the first student ");
        int Id1 = input.nextInt();
        System.out.println("Cgpa of the first student ");
        double cgpa1 = input.nextDouble();
         Student_1 s1 = new Student_1(n1, Id1, cgpa1);
        input.nextLine();
         
         System.out.println("Name of the second student ");
        String n2 = input.nextLine();
        System.out.println("Id of the second student ");
        int Id2 = input.nextInt();
        System.out.println("Cgpa of the second student ");
        double cgpa2 = input.nextDouble();
         Student_1 s2 = new Student_1(n2, Id2, cgpa2);
        
         s1.printInfo();
         System.out.println(" \n");
         s2.printInfo();
        
    }
    
}
