class K{
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
        K obj = new K();
        obj.n();
    }
    
}
