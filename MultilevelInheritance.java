class WildAnimal{
   void eat(){
   System.out.println("eating");
    }
}
class Dog1 extends WildAnimal{
    void bark(){
        System.out.println("barking");
    }
}
class Babydog extends Dog1{
    void weep(){
        System.out.println("weeping");
    }
    
}
public class MultilevelInheritance {
    public static void main(String [] args){
    Babydog b = new Babydog();
    b.eat();
    b.bark();
    b.weep();
    }
}


