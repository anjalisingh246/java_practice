// sequence of paraameters
class A2 {
    float rollno ;
    String name;
    A2(int r,String n){
    rollno = r;
    name = n;
    {
    System.out.println(rollno + " "+ name );
}
}
A2( String n, int r){
        rollno = r;
        name = n;{
        System.out.println(name + " " + rollno );
    }
}
}
 class constructoroverloading3 {
    
    public static void main(String [] args){
    A2 a = new A2(20, "amit" );
    A2 b = new A2("sumit",10 );
    }
    }
        



