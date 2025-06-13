package Innerclasstest;

public class outer {
    void display(){
        System.out.println("hi");
    }
    class inner{
void show(){
    System.out.println("hello");
}
    }
    public static void main(String[] args) {
        outer o = new outer();
        outer.inner i =o.new inner();
        i.show();
        o.display();
    }
}

