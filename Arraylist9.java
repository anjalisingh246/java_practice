// find pair with given sum
import java.util.ArrayList;
public class Arraylist9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.add(55);
int target = 50;
System.out.println(list);
for(int i=0;i<list.size();i++){
    for(int j=i+1;j<list.size();j++){
if(list.get(i)+list.get(j)==target){
    System.out.println(list.get(i) + "+" + list.get(j)  + "="+ target);
}
    } 
}
   } 
}
