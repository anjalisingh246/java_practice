 class B {
    int rollno ;
    String name;
    int age;
  B(int r,String n, int a){
    rollno = r;
    name = n;
    age = a;{
    System.out.println(rollno + " "+ name + " " +age);
}
}
  B(int r , String n){
        rollno = r;
        name = n;{
        System.out.println(rollno + " " + name );
    }
}
}
 class constructoroverloading1 {
    public static void main (String [] args){
        B obj = new B(101, "ram" + " " + "16");
       B obj1 = new B(105, "shyam");
    }
    }
        
    



