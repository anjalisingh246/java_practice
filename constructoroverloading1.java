 // no. of parameters
 class B1 {
    int rollno ;
    String name;
    int age;
  B1(int r,String n, int a){
    rollno = r;
    name = n;
    age = a;{
    System.out.println(rollno + " "+ name + " " +age);
}
}
  B1(int r , String n){
        rollno = r;
        name = n;{
        System.out.println(rollno + " " + name );
    }
}
}
 class constructoroverloading1 {
    public static void main (String [] args){
        B1 obj = new B1(101, "ram" + " " + "16");
       B1 obj1 = new B1(105, "shyam");
    }
    }
        
    



