import java.util.*;
public class factorial
 {
     public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number:");
       int n = obj.nextInt();
       int i = 1;
       int fact = 1;
        while(i<=n){
            fact = fact * i;
            i++;
        }
            System.out.println(fact);
     }
}