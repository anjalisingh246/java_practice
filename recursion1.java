// calculate factorial
class recursion1{
    public static int factorial(int n,int fact){
        if(n==1||n==0){
             System.out.println(fact);
            return 1;
        }
        fact = fact*n;
       return factorial(n-1,fact);
       
    }
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        factorial(n,fact);
    }
}