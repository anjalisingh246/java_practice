public class trycatch2 {
    public static void main(String [] args){
        try {
            int a[] = new int[5];
            a[6]=30;
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println(e);
        }
        catch (ArithmeticException e){
System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}

