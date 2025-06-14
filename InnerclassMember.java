class Outertest1{
    private int age = 40;
    void show(){
        System.out.println("outer method");
    }
        class Inner1{
            void display(){
                System.out.println("age is:"+ age);
            }
            
        }
    }
public class InnerclassMember {
    public static void main(String[] args) {
        Outertest1 obj = new Outertest1();
        Outertest1.Inner1 i = obj.new Inner1();
        i.display();
        obj.show();
    }
}
