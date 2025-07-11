package pattern;
public class pattern19 {
    public static void main(String[] args) {
        char a = 65;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a++ +"  " );
            }
            System.out.println("  ");
        }
    }
}
// A
// B C 
// D E F
// G H I J
// K L M N O