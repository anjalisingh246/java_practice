import java.util.Scanner;
public class animal
 {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the first value: ");
        float a = obj.nextFloat();
       
        System.out.print("enter the second value: ");
        float b = obj.nextFloat();
        System.out.print("enter the operator: ");
        char operator = obj.next().charAt(0);
switch(operator)
{
case '+':
System.out.println("addition is: "+(a+b));
break;
case '-':
System.out.println("substraction is: "+(a-b));
break;
case '*':
System.out.println("multification is: " +(a*b));
break;
case '/':
System.out.println("division is: "+(a/b));
break;
default:
System.out.println("invalid operator");
}
}
}
