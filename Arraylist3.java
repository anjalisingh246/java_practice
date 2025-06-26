// add elements to an Arraylist and print it
import java.util.ArrayList;
import java.util.Collection;
public class Arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
list.add(50);
list.add(80);
list.add(200);
list.add(300);
list.add(100);
list.add(90);
System.out.println(list);
// sorting the list
// Collection.sort(list);
// for(Integer number:list);
// System.out.println(number);
// find maximum elements present in an arrayList
System.out.println(list.size());
//update an element in a specific index of an Arraylist
list.set(0,99);
System.out.println(list);
// remove element from ArrayLists by Accessing its values
list.remove(2);
System.out.println(list);
// find element at specific index in an arraylist
int element = list.get(1);
System.out.println(element);
if(list.size()>0){
System.out.println("arraylist is not empty:"+list.size());
}
else{
    System.out.println("array list is empty");
}
    } 
}
