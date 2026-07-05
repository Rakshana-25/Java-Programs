import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        int num = sc.nextInt();
        int a=2,b=3;
        for(int i=1;i<=num;i++){
            System.out.print(a + " ");
            int c=a+b;
            a=b;
            b=c;
        }
       
    }
}