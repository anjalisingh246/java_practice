
import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the percentage: ");
        int per = obj.nextInt();
        if(per >= 60)
        {
            System.out.println("first division");
        }
        else if(per >= 50)
        {
            System.out.println("second division");
        }
        else if(per >= 40)
        {
            System.out.println("third division");
        }
        else if(per >= 33)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}