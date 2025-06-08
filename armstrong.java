import java.util.*;
public class armstrong {
     public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter a number:");
       int n = obj.nextInt();
       int temp ;
       int sum =0;
       temp = n;
        while(n > 0 ){
            int r = n%10;
            sum = sum+r*r*r;
         n = n/10;
        }
        if(temp == sum){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not armstrong");
        }
    }
}