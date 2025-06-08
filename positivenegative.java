import java.util.*;
public class positivenegative {
     public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter a number:");
       int n = obj.nextInt();
        if(n >= 0 ){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is negative");
        }
     }
}