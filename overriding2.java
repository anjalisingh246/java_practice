
class X {
    X m(){
        System.out.println("hello");
        return new X();
    }
}
class Y extends X{
    Y m(){
        System.out.println("hi");
        return new Y();
    }
}
public class overriding2 {
	public static void main(String[] args) {
	Y obj = new Y();
	obj.m();
	X obj1 = new Y();
	obj1.m();
	
	}
}


