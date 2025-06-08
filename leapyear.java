import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the year: ");
        int y = obj.nextInt();
        if((y % 4 == 0 && y % 100 != 0)||(y % 400 == 0))
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}