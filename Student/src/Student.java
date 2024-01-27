public class Student extends Person {
    public int id;
    public void printInfo()
    {
        super.printInfo();
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
        //Super has to be declared in a non static method
        System.out.println(super.id);
    }
    public static void main(String[] args) {
        Student p1 = new Student();
        p1.age = 19;
        p1.name = "Diganta Saha";
        p1.id = 4898;
       p1.printInfo();
//       int aaa = super.id;
    }
}
