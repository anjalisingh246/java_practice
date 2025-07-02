// print reverse of LinkedList
import java.util.*;
public class LinkedList1 {
    public static void main(String args[]){
        LinkedList<Integer> ll =new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(8);
        System.out.println(ll+" ");
        for(int i=ll.size()-1;i>=0;i--){
System.out.print(ll.get(i)+" ");
        }

    }
}
