
// remove element from ArrayLists by Accessing its values
import java.util.ArrayList;
public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
list.add("Ram");
list.add("Shyam");
list.add("Abhishek");
list.add("Mohan");
System.out.println(list);
list.remove("Shyam");
list.remove("Abhishek");
// list.remove(1);
System.out.println(list);
    }
    
}
