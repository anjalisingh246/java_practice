// To Invoke current class method
class L{
    void m(){
        System.out.println("hello");
    }
    void n(){
        System.out.println("hi");
        this.m();
    }
}
public class this4 {
    public static void main(String [] args){
        L obj = new L();
        obj.n();
    }
    
}
