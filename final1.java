class Z1{
final int age = 50;
void m1()
{
     age = 40;
    System.out.println(age);
}
}
public class final1{
    public static void main(String []args){
        Z1 obj = new Z1();
        obj.m1();
        }
}