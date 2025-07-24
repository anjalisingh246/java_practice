package Recursion;
// count number of digits
public class Recursion9 {
    public static int countDigits(int n){
if(n==0){
    return 0;
}
return 1+countDigits(n/10);
    }
    public static void main(String []args){
int n = 1947;
int result = countDigits( n);
System.out.println(result);
    }
}
