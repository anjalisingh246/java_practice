 // Single task single threaad
 class thread1 extends Thread {
public void run(){
    System.out.println("Thread is running");
}
public static void main(String[] args) {
   thread1 obj = new thread1();
    obj.start();
}
}
