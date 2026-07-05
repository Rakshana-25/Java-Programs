import java.util.*;
public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double amount = sc.nextDouble();
        System.out.println("Enter the number of years:");
        int years = sc.nextInt();
        System.out.println("Enter the rate of interest");
        double rate = sc.nextDouble();

        double interest = (amount*years*rate)/100;
        System.out.println("The simple interest of the person is "+ interest);  
    }
}