package String;
public class Sring1 {
    public static void main(String [] args){
        String s = "hello";
        String s1 = new String("world");
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s);
         System.out.println(s1);
         System.out.println("length of the string is:"+ s.length());
         System.out.println(s + " " +s1);
         System.out.println(s.equals(s2));
         System.out.println(s == s2);
         System.out.println(s.equals(s3));
         System.out.println(s == s3);
    }
}
