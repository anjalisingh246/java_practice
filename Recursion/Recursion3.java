package Recursion;
// print sum of n natural number

public class Recursion3 {
    public static int printSum(int n,int i,int sum){
if(i==n){
    sum+= n;
    System.out.println(sum);
    return 1;
}
        sum+= i;
    return printSum(n,i+1,sum);
    }
    public static void main (String [] args){
int i = 1;
int n =10;
int sum = 0;
printSum(n,i,sum);
}
}