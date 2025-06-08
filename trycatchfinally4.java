public class trycatchfinally4 {
    public static void main(String[] args) {
        try {
            int a[] = new int[4];
            a[6] = 80;
        } catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Arrayindexoutofbounds");
        }
        finally{
            System.out.println("code is executed");
        }
        System.out.println("rest of the code");
    }
}
