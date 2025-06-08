
import java.util.*;
public class palindrome {
     public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter a number:");
       int n = obj.nextInt();
       int temp ;
       int rem;
       int sum = 0;
       temp = n;
        while(n > 0 ){
            rem = n%10;
            sum = sum*10+rem;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}