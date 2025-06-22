// print sum of all the items of the array
import java.util.*;
public class Array12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of array:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        int sum =0;
        for(int i= 0;i<a;i++){
            arr[i] = sc.nextInt();
            sum+= arr[i];
        }
System.out.print("sum of array:"+sum);

    }
}
