class  Employee{
    void add( ){
        System.out.println("berofe overriding");
    }
}
class Worker extends Employee{
  void add(){
        System.out.println("after overriding");
    }
}
public class overriding1 {
    public static void main(String [] args){
        Worker obj = new Worker();
        obj.add();
    }
    
}
