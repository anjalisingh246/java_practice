import java.util.Scanner;
public class floatvalue {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the float value: ");
        float f = obj.nextFloat();
        int a = (int)(f);
        int l = (a % 10);
        {
        System.out.println("last digit of integer part is:"+l);
        }
 }
}
