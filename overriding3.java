class Sum{
   static int add(int a,int b,int c){
return a+b+c;
    }
}
class adder extends Sum{
   static  int add(int a, int b,int c){
        return a+b;
    }
}
public class overriding3 {
    public static void main(String[] args) {
        adder s = new adder();
        s.add(111,111,111);
    }
    
}
