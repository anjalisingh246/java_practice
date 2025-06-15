class U{
 static void add(int a,int b){
System.out.println(a+b);
    }
    static void add(int a,int b,int c){
System.out.println(a+b+c);
    }
}
public class overloading4 {
    public static void main(String[] args) {
    U.add(11,11);
    U.add(11,11,11);
    } 
}
