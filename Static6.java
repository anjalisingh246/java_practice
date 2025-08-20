public class Static6 {
     int i =10;
    {
        m1();
        System.out.println("first instance block parent");
    }
     public static void main(String [] args){
        Static6 obj = new Static6();
        obj.m1();
        System.out.println("main method parent");
     }
     
    public  void m1(){
        System.out.println(j);
    }
    Static6(){
        System.out.println("constructor parent");
    }
     int j =20;
}
class child2 extends Static6{
 int x=30;
{
    m2();
    System.out.println("first instance block child");
}
public static void main(String[] args) {
    child2 obj1= new child2();
    obj1.m2();
    System.out.println("main method child");
}
{
    System.out.println("second instance block");
}
public  void m2(){
    System.out.println(y);
}
child2(){
System.out.println(" child constructor");
}
    int y = 40;
}


