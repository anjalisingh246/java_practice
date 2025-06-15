class Sum{
   static void add(){
System.out.println("hi");
    }
}
class addition extends Sum{
   static void add(){
        System.out.println("hello");
    }
}
public class overriding3 {
    public static void main(String[] args) {
   addition.add();
   Sum.add();
    }  
}
