class Petanimal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Petanimal{
    void bark(){
        System.out.println("barking");
    }
}
class Cat extends Petanimal{
    void meow(){
        System.out.println("meow");
    }
}
public class HeirarchicalInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.meow();
        Dog d= new Dog();
        d.bark();
        d.eat();
    }
}
