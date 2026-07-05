import java.util.*;
public class sumOfDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        int a,b;
        while(num>=10){
            a=num%10;
            b=num/10;
            num = a+b;
        }
        System.out.println(num);
    }
}