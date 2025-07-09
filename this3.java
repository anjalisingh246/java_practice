// TO invoke the current class constructor
class T1{
    T1(){
        this(10);
        System.out.println("hi");
    }
    T1(int a){
        System.out.println("hello");
    }
}
public class this3{
    public static void main(String [] args){
        T1 obj = new T1();
    }
}


