public class Array3{
    public static void main(String [] args){
        int arr[] = {8,9,10,4,62,};
        int first = arr[0];
        for(int i=0;i<arr.length-1;i++){
        arr[i]=arr[i+1];
    }
    arr[arr.length-1]=first;
    System.out.println("Array after left shift:");
    for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
    }
}
}