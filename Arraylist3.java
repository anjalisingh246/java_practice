// update an element in a specific index of an Arraylist
import java.util.ArrayList;
public class Arraylist3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Seeta");
         list.set(0,"Mohan");

        System.out.println(list);
    }
}
