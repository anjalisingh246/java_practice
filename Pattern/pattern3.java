package pattern;
import java.util.*;
public class pattern3 {
     public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n = 5;
        int m = n;
      for(int i = 1 ; i <= n ; i++){
for(int j = 1 ; j<= m ; j++)
{
    System.out.print("   ");
}
for(int k = 1; k <= 2*i-1 ; k++){
    System.out.print (" * ");
}
m--;
System.out.print("\n");

        }
    }
}
//                  *
//               *  *  *
//            *  *  *  *  *
//         *  *  *  *  *  *  *
//       * *  *  *  *  *  *  *  *  