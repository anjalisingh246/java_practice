// print the element of an array
import java.util.*;
public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of array:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i= 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
System.out.print("elements of an array:");
for(int i=0;i<a;i++){
    System.out.println(arr[i]);
}
    }
}
