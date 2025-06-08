class adder{
   void  add(int a,int b, int c){ 
        System.out.println(a+b+c);
}
void add(int a, int b){
System.out.println(a+b);
    }
}
public class overloading1 {
    public static void main(String [] args){
        adder obj = new adder();
        obj.add(11,11,11);
        obj.add(11,11);

    }
    
}
