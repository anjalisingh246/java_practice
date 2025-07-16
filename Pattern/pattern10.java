package Pattern;

import java.util.*;
public class pattern10 {
     public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n = 5;
        int m = n;
      for(int i = 1 ; i <= n-1; i++){
for(int j = 1 ; j<= m ; j++)
{
    System.out.print("   ");
}
for(int k = 1; k <= 2*i-1 ; k++){
    System.out.print (" * ");
}
    System.out.print("\n");
    m--;
}
for(int l = 1 ; l <= n ; l++){
    for(int p = 1 ; p<= l ; p++)
    {
        System.out.print("   ");
    }
    for(int q = 9;q >= 2*l-1 ; q--){
        System.out.print (" * ");
    }
    System.out.print("\n");
    m++;
        }
    }
}
//              *
//           *  *  *
//        *  *  *  *  *
//     *  *  *  *  *  *  *
//  *  *  *  *  *  *  *  *  *
//     *  *  *  *  *  *  *
//        *  *  *  *  * 
//           *  *  * 
//              *