package thread;
 // Single task single threaad
 class Thread1 extends Thread {
public void run(){
    System.out.println("Thread is running");
}
public static void main(String[] args) {
   Thread1 obj = new Thread1();
    obj.start();
}
}
