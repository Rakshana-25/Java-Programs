import java.util.*;
public class Swapping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);;
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        System.out.println("BEFORE SWAPPING");
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
        System.out.println("value of c: " + c);

        int temp = a;
        a=b; b=c;
        c=temp;

        System.out.println("AFTER SWAPPING");
        System.out.println("value of a: " + a );
        System.out.println("value of b: " + b);
        System.out.println("value of c: " + c);
    }
}