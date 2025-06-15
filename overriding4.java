class parent{
    parent(){
System.out.println("parent constructor");
    }
    void m1(){
        System.out.println("parent");
    }
}
class child extends parent{
    child(){
        //super(); 
        System.out.println("child constructor");
    }
    void m1(){
        System.out.println("child");
    }
}
public class overriding4 {
    public static void main(String[] args) {
        child c = new child();
        c.m1();
    }
    
}
