//power of a number
import java.util.Scanner;
 public class Recursion5{
public static int power(int n,int a){
if(a==0){
    return 1;
}
return n*power(n,a-1);
}
public static void main(String [] args){
Scanner sc =new Scanner(System.in);
System.out.print("enter the number:");
int n = sc.nextInt();
System.out.print("Enter the power:");
int a = sc.nextInt();
int result = power(n,a);
System.out.println(result);
}
}
// import java.util.Scanner;
//  public class Recursion5{
// public static void power(int n,int a,int i,int power){
//     if(i==a){
//         System.out.println(power);
//         return;
//     }
// power =n*power;
//  power(n,a,i+1,power);
// }
// public static void main(String [] args){
// Scanner sc =new Scanner(System.in);
// System.out.print("enter the number:");
// int n = sc.nextInt();
// System.out.print("Enter the power:");
// int a = sc.nextInt();
// int i=0;
// int power =1;
// power(n,a,i,power);
// }
//  }