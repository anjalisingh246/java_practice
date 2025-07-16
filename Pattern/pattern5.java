package Pattern;
import java.util.*;
public class pattern5 {
     public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter a number:");
        int n = obj.nextInt();
        int m = n;
      for(int i = 1 ; i <= n ; i++)
      {
for(int j = 1 ; j <= m ; j++)
{
    System.out.print("   ");
}
for(int k = 1; k <= n ; k++)
{
    System.out.print(" *  ");
}
System.out.print("\n ");
  m--;
} 
          
}
}
//              *    *    *    *    *    *
//            *    *    *    *    *    *
//          *    *    *    *    *    *
//        *    *    *    *    *    *
//      *    *    *    *    *    *
//    *    *    *    *    *    *