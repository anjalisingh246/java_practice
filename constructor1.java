// parameterized constructor
class G{
    int age;
    G(int a){
        age = a;
        System.out.println(age);
    }
}
public class constructor1 {
    public static void main(String [] args){
        G obj = new G(35);
    }
}
