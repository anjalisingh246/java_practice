class A {
    float rollno ;
    String name;
    A(int r,String n){
    rollno = r;
    name = n;
    {
    System.out.println(rollno + " "+ name );
}
}
A(float r , String n){
        rollno = r;
        name = n;{
        System.out.println(rollno + " " + name );
    }
}
}
 class constructoroverloading2 {
    
    public static void main(String [] args){
    A a = new A(20, "ram" );
    A b = new A(10, "shyam");
    }
    }
        

