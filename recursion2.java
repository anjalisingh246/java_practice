class RecursionExample2{
   static int n1 = 0;
   static int n2 = 1;
   static int n3 = 0;
    public static void fibonacci(int count){
if(count > 0){
n3 = n1+n2;
n1 = n2;
n2 = n3;
System.out.println(" "+n3);
fibonacci(count - 1);
     }
}
}
public class recursion2 {
    public static void main(String[] args) {
        int count = 18;
        System.out.println(RecursionExample2.n1+" "+ RecursionExample2.n2);
        RecursionExample2.fibonacci(count - 1);

    }
}
