import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the number of subjects: ");
        int n=sc.nextInt();
        System.out.println("Enter the subject marks:");
        for(int i=1;i<=n;i++)
        {
            System.out.print("Subject "+i+":");
            int marks = sc.nextInt();
            sum+=marks;
        }
        double Average = sum/n;
        System.out.println("The total marks: " + sum); 
        System.out.println("The average marks of the subjects:" + Average);
    }
}