class W{
    void pencil(){
System.out.println("hi");
    }    
}
class X extends W{
     void pen(){
System.out.println("hello");
     }
    }
    class Y extends W{
        void eraser(){
            System.out.println("bye");
        }
    }
    class P extends X{
        void sharpener(){
            System.out.println("goodbye");
        }
    }
public class HybridInheritance {
    public static void main(String[] args) {
        P z = new P();
        z.pencil();
        z.pen();
        z.sharpener();
        Y y = new Y();
        y.pencil();
        y.eraser();
        
    }
}
