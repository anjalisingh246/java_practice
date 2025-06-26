// power of a number
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
int n=sc.nextInt();
System.out.print("enter the power:");
int a = sc.nextInt();
int power =1;
for( int i=1;i<=a;i++){
 power*=n;
}
System.out.println(power);
        }
    }

