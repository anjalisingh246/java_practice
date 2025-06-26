
// left rorate element by 2
import java.util.ArrayList;
public class Arraylist5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.add(60);
System.out.println("arraylist before rotation:"+list);
for(int i=0;i<2;i++){
    int first = list.remove(0);
    list.add(first);
}
System.out.println("arraylist arter left rotation:"+list);

    } 
}
