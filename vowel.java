import java.util.Scanner;
public class vowel {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      System.out.println("enter a value:");
      char Ch = obj.next().charAt(0);
      if (Ch == 'a' || Ch == 'e' || Ch == 'i' || Ch == 'o' || Ch == 'U' ) 
      {
         System.out.println("VOWEL");
      } 
      else
       {
         System.out.println("CONSONANT");
      }

   }
}