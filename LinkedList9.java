//print sum of linkedlist
import java.util.*;
package linkedlist;
public class LinkedList9 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(1);
         ll.add(3);
          ll.add(2);
           ll.add(5);
           int sum =0;
           for(int i=1;i<=ll.size();i++){
           sum+=i;
           }
           System.out.println(sum);
    }
}
