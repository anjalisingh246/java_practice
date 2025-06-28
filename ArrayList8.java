// remove duplicate elements
import java.util.ArrayList;
public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(4);
System.out.println(list);
for(int i=0;i<list.size();i++){
    for(int j=i+1;j<list.size();j++){
        if(list.get(i)==list.get(j)){
           list.remove(j);
}
        }
    }
        System.out.print(list+" ");
    }
}


