

class student{
    int id;
    String name;
    student(int a, String n){
         id = a;
         name = n;
        System.out.println(id +" "+name);
    }
    student(student s){
        id =  s.id;
        name = s.name;
               System.out.println(id +" "+name); 
    }
}
public class constructor3 {
    public static void main(String [] args){
    student s1 = new student(101 ," suresh");
    student s2 = new student(s1);
    }  
}
