// print the element of an array present on odd position
import java.util.*;
public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of array:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i= 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
System.out.println("elements at odd position:");
for(int i=1;i<a;i+=2){
    System.out.println(arr[i]);
}
    }
}
