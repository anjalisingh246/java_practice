import java.util.*;
public class table {
     public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number:");
       int n = obj.nextInt();
        for( int i = 1 ; i <= 10 ; i++ ){
            System.out.println(i*n);
        }
     }
}