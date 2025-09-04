
import javax.xml.transform.Templates;

public class TestGarbage2 {
    public static void main(String[] args) {
      TestGarbage2 obj = new TestGarbage2();
obj = null;
     TestGarbage2 a = new TestGarbage2();
          TestGarbage2 b = new TestGarbage2();
          b=a;
          System.gc();
    }
    protected void finalize() throws Throwable{
        System.out.println("Garbage collection is perpormed by JVM");
    }
}
