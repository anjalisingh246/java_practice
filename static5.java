
 class static5 {
    static int x =10;
    static{
        m1();
        System.out.println("first static block parent");
    }
    // public static void main(String [] args){
    //     m1();
    //     System.out.println("main method parent");
    // }
    public static void m1(){
        System.out.println(y);
    }
    static{
        System.out.println("second static block parent");
    }
    static int y =20;
}
class child1 extends static5{
static int i=30;
static{
    m2();
    System.out.println("first static block child");
}
public static void main(String[] args) {
    m2();
    System.out.println("main method child");
}
public static void m2(){
    System.out.println(j);
}
static{
System.out.println("second static block child");
}
   static int j = 40;
}


