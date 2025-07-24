package Recursion;
// print reverse string
public class Recursion5 {
    public static String reverse(String str){
if(str.isEmpty()){
    return str;
}
return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String []args){
        String str = "HelloWorld";
String s =reverse(str);
System.out.println(s);
    }
}
