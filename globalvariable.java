
import java.util.Scanner;
   public  class globalvariable{
    int n1;
    int n2;
    public void getInput(){
Scanner kb = new Scanner(System.in);
System.out.print("enter the first number");
 n1 = kb.nextInt();
System.out.print("enter the second number");
 n2 = kb.nextInt();
    }
   
public void addition()
{
    int Sum = n1 + n2;
  System.out.println("adddition is:"+ Sum);
}
public void difference()
{
int Difference = n1-n2;
System.out.println("difference is:"+ Difference);

}
public void Product()
{
int product = n1*n2;
System.out.println("product is:"+product);
}
public void quotient()
{
float Quotient = n1/n2;
    System.out.println("quotient is:"+Quotient);
}
public static void main(String[] args) {
    globalvariable obj = new globalvariable();
    obj.getInput();
    obj.addition();
    obj.difference();
    obj.Product();
    obj.quotient();
}
}