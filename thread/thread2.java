package thread;
 // Single Task multiple THreads
 class Testcallrun1 extends Thread{
public void run(){
    System.out.println("Thread is running");
}
 }
 class Testcallrun2 extends Thread {
public void run(){
    System.out.println("Thread is running ");
}
}
public class  thread2 {
public static void main(String[] args) {
   Testcallrun1 obj = new Testcallrun1();
    obj.start();
    Testcallrun2 obj1= new Testcallrun2();
    obj1.start();
}
}
