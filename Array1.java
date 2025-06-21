// copy elements from one array to another array
import java.util.*;
public class Array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        int arr2[]= new int[a];
        for(int i = 0; i <a;i++)
            arr[i]= sc.nextInt();
            for(int i = 0;i<a;i++)
            arr2[i]=arr[i];
        System.out.println("elements copied to new array:");
        for(int j = 0;j<a;j++){
            System.out.print(arr2[j]+" ");
        }
    }
}