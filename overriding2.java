
class T {
  T m(){
        System.out.println("hello");
        return new T();
    }
}
class S extends T{
    S m(){
        System.out.println("hi");
        return new S();
    }
}
public class overriding2 {
	public static void main(String[] args) {
	S obj = new S();
	obj.m();
	T obj1 = new S();
	obj1.m();
	
	}
}


