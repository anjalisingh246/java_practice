// print reverse a linkedlist
import java.util.LinkedList;
public class LinkedList1 {
      public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("john");
        ll.add("john1");
        ll.add("john2");
        ll.add("john3");
        System.out.println("original linkedlist is:"+ll);
         System.out.print("reverse linkedlist is:");
        for(int i=ll.size()-1;i>=0;i--){
            System.out.print(ll.get(i)+" ");
        }
        
}
}