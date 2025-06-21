//priint reverse of the array
import java.util.*;
public class Array6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   System.out.print("enter the size of array:");
      int a = sc.nextInt();
    int[] arr = new int[a];
        for(int i = 0;i<a;i++)
             arr[i] = sc.nextInt();
        System.out.println("reverse of the array is:");
        for (int j = a-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}
