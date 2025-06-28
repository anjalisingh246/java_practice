// print numbers from n to 1
import java.util.Scanner;
public class Recursion8 {
    public static void printNumber(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
        printNumber(n);
    }
}
