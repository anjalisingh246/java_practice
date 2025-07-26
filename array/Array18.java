import java.util.Scanner;
public class Array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of array:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        
        for(int i= 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>=arr[j+1]){
                System.out.println(arr[j]);
            }
        }
    }
}