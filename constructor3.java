// copy constructor
class Q{
    int id;
    String name;
    Q(int a, String n){
         id = a;
         name = n;
        System.out.println(id +" "+name);
    }
    Q(Q s){
        id =  s.id;
        name = s.name;
       System.out.println(id +" "+name); 
    }
}
public class constructor3 {
    public static void main(String [] args){
    Q s1 = new Q(101 ," suresh");
    Q s2 = new Q(s1);
    }  
}
