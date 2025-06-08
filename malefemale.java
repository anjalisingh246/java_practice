import java.util.*;
public class malefemale {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name : ");
        String name = sc.next().toLowerCase();
        System.out.print("enter the geneder (m/f):");
        char ch = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("enter the marital:");
        String marital = sc.nextLine().toLowerCase();
        System.out.print("enter the age : ");
        int age = sc.nextInt();
        if( age >= 25 && marital.equals("married") &&  ch == 'm'){
            System.out.println("accout provided");
        }
      else if(age > 0 && marital.equals("unmarried")){
        System.out.println("account provided");
      }
    else if( age >= 35 && marital.equals("married") &&  ch == 'f'){
        System.out.println("accout provided");
    }
else{
    System.out.println("account not provided");
}
    }
}
