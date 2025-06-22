// print the smallest element in an array
import java.util.*;
public class Array10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i= 0; i<a;i++){
            arr[i]= sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0;i<a;i++){
        if( arr[i]< min){
            min = arr[i];
        }
    }
    System.out.print("smallest element is:"+min);
} 
}
