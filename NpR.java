import java.util.*;
public class NpR{
    static int add(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print("Enter a number:");
        int b = sc.nextInt();

        return a+b;

    }
    public static void main(String[] args){
        
        System.out.println("The sum is" + " " + add());
    }
    
}

