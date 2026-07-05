import java.util.*;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer value:");
        int a = sc.nextInt();
        System.out.print("Enter a float value:");
        float b = sc.nextFloat();
        sc.nextLine(); // Consume the newline character
         System.out.print("Enter a string:");
        String name = sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        sc.close();
    }
}
