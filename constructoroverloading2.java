// data type of paraameters
class A1 {
    float rollno ;
    String name;
    A1(int r,String n){
    rollno = r;
    name = n;
    {
    System.out.println(rollno + " "+ name );
}
}
A1( float r,String n){
        rollno = r;
        name = n;{
        System.out.println(rollno + " " + name );
    }
}
}
 class constructoroverloading2 {
    
    public static void main(String [] args){
    A1 a = new A1(20, "ram" );
    A1 b = new A1(10, "shyam");
    }
    }
        

