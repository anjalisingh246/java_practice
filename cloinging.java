class test implements Cloneable{
int rollno ;
String name;
int age;
test(int rollno, String name , int age){
    this.rollno = rollno;
    this.name = name;
    this.age = age;
}
public Object clone() throws CloneNotSupportedException {
return super.clone();
}
}
public class cloinging {
    public static void main(String[] args) {
        try{
        test t1 = new test(101,"Amit",40);
        test t2 = (test)t1.clone();
        System.out.println(t1.rollno+" "+ t1.name + " "+ t1.age);
        System.out.println(t2.rollno+ " "+ t2.name+" "+ t2.age);}
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
