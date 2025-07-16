package Pattern;
public class pattern4 {
     public static void main(String args[]){

        int n = 5;
        int m = n;
      for(int i = 1 ; i <= n ; i++)
      {
for(int j = 1 ; j <= m ; j++)
{
    System.out.print(" ");
}
for(int k = 1; k <= n ; k++)
{
    if (i== 1|| k == 1 || i == n || k == n )
    {
        System.out.print( "* ");
}
else
 {
System.out.print("  ");
}
}
System.out.print("\n");
m--;
} 
          
}
}
//        *  *  *  *  *
//      *           *
//    *           *
//  *           *
//*  *  *  *  * 