package Recursion;
public class Recursion6 {
    public static void main(String [] args){
        
int arr[] = {11,2,30,8,4,10,3};

       boolean sorted = sortedArray(arr, 0);
        System.out.println(sorted);
    }
    public static boolean sortedArray(int arr[],int index){
if(index ==arr.length-1){
     return true;
}
if (arr[index]>arr[index+1]) {
     return false;
}
 return sortedArray(arr, index+1);
    }
}
