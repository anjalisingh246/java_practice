import java.util.*;
public class sum {
     public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number:");
       int n = obj.nextInt();
       int a = 0;
        for( int i = 0 ; i <= n ; i++ )
            a = a+i;{
            System.out.println(a);
        }
     }
}