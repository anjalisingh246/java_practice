import java.util.*;
public class ArrayList1 {
    public static void main (String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(50);
        list.add(40);
        System.out.println("original ArrayList is:"+ list);
        //ArrayList<Integer> b = new ArrayList<>(list);
        Collections.reverse(list);
        System.out.println("reversed ArrayList is:"+list);
           
 }
}