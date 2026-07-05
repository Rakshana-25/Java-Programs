import java.util.*; 
public class ConStatements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int n = sc.nextInt();
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println("Leap Year");
                }
                else
                    {
                    System.out.println("clsNot a Leap Year");
                    }
            }
            else
                {
                System.out.println("Leap Year");
                }
        }
        else{
            System.out.println("Not a Leap Year");
        }
    sc.close();
    }
}
        
       

