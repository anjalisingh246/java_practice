import java.util.*;
    public class Test12{
    public static void main(String[] args) throws InterruptedException{
        Test12 t1= new Test12();
        Test12 t2= new Test12();
        t1 = null;
        System.gc();
        t2 = null;
        Runtime.getRuntime().gc();}
        @Override
        protected void finalize() throws Throwable{
System.out.println("garbage collector called");
System.out.println(" object garbage collected"+this);
        }
}
