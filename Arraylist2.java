// find element at specific index in an arraylist
import java.util.ArrayList;
public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
list.add("Ram");
list.add("Shyam");
list.add("Abhishek");
list.add("Mohan");
System.out.println(list);
String element = list.get(1);
System.out.println(element);
    }
    
}
