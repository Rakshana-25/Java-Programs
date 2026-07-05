import java.util.*;
public class StudentDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student details");
        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
        System.out.println("Enter the student register number:");
        long regNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the section:");
        String Section = sc.nextLine();

        System.out.println("STUDENT DETAILS");
        System.out.println("Name of the student: "+name);
        System.out.println("Student register number: "+regNumber);
        System.out.println("Student section: "+Section);
    }
}