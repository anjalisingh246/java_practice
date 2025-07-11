// print the element of an array present on even position
import java.util.*;
public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of array:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i= 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
System.out.println("elements at even position:");
for(int i=0;i<a;i+=2){
    System.out.println(arr[i]);
}
    }
}
