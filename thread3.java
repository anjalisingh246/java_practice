//multiple task miultiple threads
class Testcallrun3 extends Thread {
public void run(){
System.out.println("thread is running");
}
}
class Testcallrun4 extends Thread {
    public void run(){
System.out.println("running");
    }
}
public class thread3 {
    
    public static void main(String[] args) {
        Testcallrun3 obj = new Testcallrun3();
        obj.start();
        Testcallrun4 obj2 = new Testcallrun4();
        obj2.start();
    }
}
