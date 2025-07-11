package pattern;
import java.util.*;
public class pattern7 
{
public static void main(String []args){
Scanner obj = new Scanner(System.in);
    int n =5;
    int m = n;
    for(int i = 1; i <= 5 ; i++)
    {
        for(int j = 0; j<= m; j++)
        {
            System.out.print("  ");
    }
    for(int k = 1 ; k <= i; k++)
    {
        if(k==1 || k==i || i==5){
        System.out.print("* ");
    }
    else{
        System.out.print("  ");
    }
}
    m--;
    System.out.print("\n");
    }
}

}
   
//            *
//          * *
//        *   *
//      *     *
//    * * * * *      
