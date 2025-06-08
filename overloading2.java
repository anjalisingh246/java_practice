class subtraction {
    void sub(int a,int b){
        System.out.println(a-b);
    }
    void sub(double a, double b){
        System.out.println(a-b);
    }
}
public class overloading2 {
    public static void main(String [] args){
        subtraction obj = new subtraction();
        obj.sub(11,22);
        obj.sub(23.5,67.9);
    }
    
}
