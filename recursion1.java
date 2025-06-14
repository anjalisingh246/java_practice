class FactorialExample{
    public static int factorial(int n){
if(n == 1 || n == 0)
return 1;
else 
return n*factorial(n-1);
    }
}
public class recursion1{
    public static void main(String[] args) {
        int num = 6;
        int result = FactorialExample.factorial(num);
        System.out.println("factorial of number is:" + result);
    }
}
