public class Array4 {
    public static void main(String[] args) {
        int arr[] = {10,80,30,10,40,30,50,80};
      for(int i=0;i<arr.length;i++){
 for(int j=i+1;j<arr.length;j++){
if(arr[i] == arr[j]){
System.out.println(arr[j]);
break;
        }
     }
   }
  }
}

