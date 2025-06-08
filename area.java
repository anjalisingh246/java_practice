import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the radius: ");
        float r = obj.nextFloat();
        float a = 3.14f*r*r;
        {
            System.out.println("area is: "+a);
        }
    }
}