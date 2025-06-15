 // Sequence of parameters
 class V {
  void run(int a,String b){
       System.out.println("running");
    }
   void run(String a, int b){
System.out.println("eating");
     }
    }
public class overloading3{
    public static void main(String [] args){
        V obj = new V();
        obj.run(10,"hi");
        obj.run("hello",20);
    }
}

