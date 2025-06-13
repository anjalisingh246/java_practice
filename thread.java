 class K extends Thread {
public void run(){
    System.out.println("Thread is running");
}
 class L extends Thread {
public void run(){
    System.out.println("Thread is running");
}
}
public class thread{
public static void main(String[] args) {
   K obj = new K();
   L obj1 = new L();
    obj1.start();
    obj.start();
}
}
