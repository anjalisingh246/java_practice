public class trycatch1{
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5]= 30/0;
        } catch (ArithmeticException e) {
System.out.println("arithmetic exception occurs");
        }
       
        System.out.println("rest of the code");
    }
}