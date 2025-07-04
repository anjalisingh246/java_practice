import java.util.*;
public class LinkedList5 {
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("john");
        ll.add("john1");
        ll.add("john2");
        ll.add("john3");
        System.out.println("before right rotation:"+ll);
      for(int i = ll.size();i>ll.size()-2;i--){
        String last = ll.remove(ll.size()-1);
ll.addFirst(last);
      }
System.out.println("arter right rotation:"+ll);
    }
}
