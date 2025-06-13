package Innerclasstest;

 public class Membertest {
    void display(){
        System.out.println("hi");
    }
    class inner{
void show(){
    System.out.println("hello");
}
}
  public static void main(String[] args) {
        Membertest o = new Membertest();
        Membertest.inner i = o.new inner();
        i.show();
        o.display();
    }
}

