import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a = obj.nextInt();
        System.out.print("enter the second numbert: ");
        int b = obj.nextInt();
        int c = a + b;
        {
            System.out.println("addition is: "+c);
        }
    }
}