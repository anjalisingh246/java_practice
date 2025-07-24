public class trycatch3 {
    public static void main(String [] args){
        try {
            try{
                int a =20/0;
            }
         catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurs");
        }
    }
        catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException occurs");
        }

        System.out.println("rest of the code");
    }
}