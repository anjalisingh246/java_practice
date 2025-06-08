class M{
    void name(M m){
        System.out.println("method is invoked");
    }
    void rollno(){
       name(this);
        System.out.println("hi");
    }
}
public class this1 {
    public static void main(String []args){
        M obj = new M();
        obj.rollno();
    }
    
}
