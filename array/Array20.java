import java.util.Scanner;
public class Array20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of element:");
        int a = sc.nextInt();
        int[] arr = new int[a]; 
        for(int i =0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
         int smallest= arr[0];
         for (int i = 0; i < a; i++) {
             if(arr[i]<smallest){
                smallest= arr[i];
             }
         }
         System.out.println("smallest number is:"+ smallest);
    }
}
