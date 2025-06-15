class Mudrika{
   Object m1(){
        System.out.println("lado");
        return new Object();
    }
}
class Akarshan extends Mudrika{
    Integer m1(){
        System.out.println("bhumika");
        return new Integer(1);
    }
}
public class overriding5 {
    public static void main(String[] args) {
        Akarshan c = new Akarshan();
        c.m1();
        c.m1();
    }
    
}
