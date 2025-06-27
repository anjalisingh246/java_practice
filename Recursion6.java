public class Recursion6 {
    public static int reverse(int a,int n){
if(a==1){
    System.out.println(a);
    return 1;
}
 n = a%10;
reverse(a-1,n);
    }
    public static void main(String[] args) {
    int a = 198;
    int n;
reverse(a,n);
    }
}
