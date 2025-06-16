
class C1{
    static int v = 50;
    void m1(){
         System.out.println("hello");
    }
    static class C2{
        void m1(){
        System.out.println(v);
    }
}
}
public class static4 {
     public static void main(String[] args) {
     C1 obj = new C1(); 
     C1.C2 obj2 = new C1.C2();  
     obj.m1();
     obj2.m1();
    }
}
