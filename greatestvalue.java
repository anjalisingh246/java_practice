import java.util.Scanner;
public class greatestvalue {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a first value: ");
        int a = obj.nextInt();
        System.out.print("enter a second value: ");
        int b = obj.nextInt();
        System.out.print("enter a third value: ");
       int c = obj.nextInt();
        if(a > b && a > c)
        {
            System.err.println("first is greater");
        }
        else if(b > a && b > c)
        {
            System.out.println("second is greater");
        }
        else if(c > a && c > b)
        {
            System.out.println("third is greater");
        }
        else{
            System.out.println("values are equal");
        }
    }
}
