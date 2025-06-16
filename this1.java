// TO pass as an argument in the method
class M1 {
    void n1(M1 m){
        System.out.println("method is invoked");
    }
    void n2(){
       n1(this);
        System.out.println("hi");
    }
}
public class this1 {
    public static void main(String []args){
        M1 obj = new M1();
        obj.n2();
    }
    
}
