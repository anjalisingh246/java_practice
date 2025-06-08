import java.util.*;
public class evenodd {
     public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter a number:");
       int n = obj.nextInt();
        if(n % 2 ==0 ){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
     }
}

