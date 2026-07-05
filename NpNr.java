import java.util.*;
public class NpNr{
    static void add(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print("Enter a number:");
        int b = sc.nextInt();

        System.out.println("The sum is" + " " + (a+b));
    }

    public static void main(String[] args){
        add();
    }
}


