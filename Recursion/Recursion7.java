package Recursion;
// sum of digits of a number
public class Recursion7 {
    public static int sumDigits(int n){
if(n==0)
 return 0;

return (n%10)+sumDigits(n/10);
    }
    public static void main(String[] args) {
    
    int n=9653;
int ans = sumDigits(n);
System.out.println(ans);
    }
}
