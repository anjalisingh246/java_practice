package function;
// clculate addition of two numbers
import java.util.Scanner;

public class Function1 {
    public static int printSum(int a,int b){
       int sum = a+b;
return sum;
    }
        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
             System.out.println("enter the second number");
        int b= sc.nextInt();
          int sum =  printSum(a,b);
  System.out.println("sum of two number is:"+sum);
    }
}
