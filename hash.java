import java.util.*;
public class hash{
     public static void main(String Args[]){

           Map<Integer,String> hs=new HashMap<>();
           hs.put(1,"5");
           hs.put(2,"1");
           hs.put(3,"2");
           hs.put(4,"4");
           hs.put(5,"3");
           System.out.println(hs);
           System.out.println(hs.get(1));
           hs.remove(5);
       
           for(Map.Entry<Integer,String> entry:hs.entrySet()){
                 System.out.println("key:"+entry.getKey() + " Value :"+entry.getValue());
           }
     }
}