import java.util.Scanner;
public class prime {
     public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter a number:");
       int n = obj.nextInt();
       int i = 1; 
       int c = 0;
        while(i <= n ){
            if(n % i == 0){
                c++;
            }
            i++;
        }
        if(c == 2){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
}