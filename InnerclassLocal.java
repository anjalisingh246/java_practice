 class outertest {
    void eat(){
        class innertest {
            void show(){
                System.out.println("inner class");
            }
        }
        System.out.println("outer class");
        innertest obj = new innertest();
        obj.show();
    }
}
public class InnerclassLocal{
    public static void main(String[] args) {
        outertest obj1=new outertest();
        obj1.eat();
    }
}
