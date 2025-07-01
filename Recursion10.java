public class Recursion10 {
    public static void main(String[] args) {
        int a=commonDivisor(2,22);
System.out.println(a);
 }
    public static int commonDivisor(int a,int b){
        if(b==0){
            return a;
        }
        else{
        return commonDivisor(b,a%b);
        }
    }
}
