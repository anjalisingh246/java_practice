// to refer current class Instance variable
class F1 {
  float  rollno;
  String name;
  F1(float rollno, String name){
    this.rollno = rollno;
    this.name = name;
    System.out.println(rollno + " " + name );
  }
}
public  class this2 {
    public static void main(String args[]){
        F1 obj = new F1(101 , "ram");
        
    }
}