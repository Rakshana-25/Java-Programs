import java.util.*;
public class hey{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int x=sc.nextInt();
    int n=Math.abs(x);
    int org;
    int rev=0;
    while(n>0)
        {
        org= n %10;
        if (rev>(Integer.MAX_VALUE)/10)
        {
            System.out.println("0");
        }
        rev=rev*10 + org;
        n=n/10;
        }
        int m = (x>0)?(rev):(-rev);
        System.out.println(m);
        
   } 
}