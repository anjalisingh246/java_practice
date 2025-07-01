public class ArrayList13 {
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,5,4};
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                System.out.print(arr[i]+" ");
            
            }
        }
    }
}
