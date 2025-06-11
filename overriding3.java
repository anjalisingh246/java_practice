class Sum{
   static int add(int a,int b,int c){
return a+b+c;
    }
}
class addition extends Sum{
   static  int add(int a, int b,int c){
        return a+b+c;
    }
}
public class overriding3 {
    public static void main(String[] args) {
        addition s = new addition();
        s.add(1,2,3);
    }  
}
