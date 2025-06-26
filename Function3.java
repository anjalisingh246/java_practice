
import java.util.Scanner;

public class Function3
 {
    public static void calculateFactorial(int n){
        int fact =1;
        if(n<0){
         System.out.println("invalid input");
         return;
        }
        for(int i=n;i>=1;i--){
        fact = i*fact;
        }
        System.out.println("factorial is:"+fact);
return;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the number:");
      int n=sc.nextInt();
        calculateFactorial(n);

    }
 }