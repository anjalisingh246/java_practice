import java.util.Scanner;
public class eligibel {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the height: ");
        int h = obj.nextInt();
        System.out.print("enter the weight: ");
        int w = obj.nextInt();
        if(h > 6 && w > 70)
        {
            System.out.println("eligibel for army");
        }
        else{
            System.out.println("not eligibel for army");
        }
    }
}