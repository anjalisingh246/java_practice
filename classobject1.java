class Labour{
    int id;
    String name;
 static int salary = 15000;
   static void worker(int a,String n){
    int salary = 16000;
      int  id = a;
       String name = n;
        System.out.println(id + " "+  name +" "+salary);
    }
} 
public class classobject1{
    public static void main(String [] args){
        Labour e1 =new Labour();
        Labour e2 = new Labour();
        Labour e3 = new Labour();
        e1.worker(10,"sonoo");
        e2.worker(20,"ramu");
        e3.worker(30,"shyamu");
    }
}

