
import java.util.*;
 class H6{
    String name;
    int salary;
    H6(String name,int salary){
        this.name=name;
        this.salary = salary;
    }
}
public class Arraylist2 {
    public static void main(String[] args) {
     ArrayList<H6> employees = new  ArrayList<>();
     employees.add(new H6("Bhumika",20000));
    employees.add(new H6("Kanha",30000));
    employees.add(new H6("Ankita",40000));
    employees.add(new H6("Tanushka",50000));
    Scanner sc = new Scanner(System.in);
    System.out.print("enter what you want to view(name/salary):");
    String input = sc.nextLine().toLowerCase();
    if(input.equals("name")){
        for(H6 a :employees){
            System.out.println(a.name);
        }
    }
        else if(input.equals("salary")){
            for(H6 b : employees){
                System.out.println(b.salary);
            }
  }
else{
    System.out.println("enter the valid input(name/salary)");
}
    }
}
