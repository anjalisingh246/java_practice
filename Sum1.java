import java.util.*;
public class Sum1 {
     public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number:");
       int n = obj.nextInt();
       int a = 0;
        for( int i = 0 ; i <= n ; i++ )
            a+=i;{
            System.out.println(a);
        }
     }
}