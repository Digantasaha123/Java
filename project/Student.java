
import java.util.ArrayList;
import java.util.Scanner;

// Parent class representing a Student
class Student {
    private String studentId;
    private String password;

    public Student(String studentId, String password) {
        this.studentId = studentId;
        this.password = password;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getPassword() {
        return password;
    }
}


// Class representing an Online Exam Portal
class OnlineExamPortal {
    private ArrayList<ExamStudent> students;

    public OnlineExamPortal() {
        students = new ArrayList<>();
        // Pre-populating the portal with some students
        students.add(new ExamStudent("1001", "password1", "John"));
        students.add(new ExamStudent("1002", "password2", "Emma"));
        students.add(new ExamStudent("1003", "password3", "Michael"));
    }

    public boolean login(String studentId, String password) {
        for (ExamStudent student : students) {
            if (student.getStudentId().equals(studentId) && student.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void startExam(ExamStudent student) {
        System.out.println("Welcome, " + student.getName() + "! You can now start the exam.");
        // Code for starting the exam goes here
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OnlineExamPortal examPortal = new OnlineExamPortal();

        System.out.println("Enter your Student ID:");
        String studentId = scanner.nextLine();

        System.out.println("Enter your Password:");
        String password = scanner.nextLine();

        if (examPortal.login(studentId, password)) {
            ExamStudent student = null;
            for (ExamStudent s : examPortal.students) {
                if (s.getStudentId().equals(studentId)) {
                    student = s;
                    break;
                }
            }

            examPortal.startExam(student);
        } else {
            System.out.println("Invalid login credentials. Please try again.");
        }
    }
}