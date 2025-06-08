class Book{
    static{System.out.println(" static method is invoked");}
    {System.out.println("main method is invoked");}
}
public class static3 {
    public static void main(String [] args){
        Book obj = new Book();
    }
}
    

