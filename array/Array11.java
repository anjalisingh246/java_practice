// print the number of elements present in an array
import java.util.*;
public class Array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of array:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i= 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
System.out.print("number of elements of an array:"+arr.length);

    }
}
