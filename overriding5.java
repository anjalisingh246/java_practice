class Mudrika{
    Mudrika(){
        System.out.println("parent constructor invoked");
    }
    void m1(){
        System.out.println("lado");
    }
}
class Akarshan extends Mudrika{
    Akarshan(){
        System.out.println("child constructor invoked");
    }
    void m1(){
        System.out.println("bhumika");
    }
}
public class overriding5 {
    public static void main(String[] args) {
        Akarshan c = new Akarshan();
        c.m1();
    }
    
}
