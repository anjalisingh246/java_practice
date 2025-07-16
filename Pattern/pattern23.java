package Pattern;

public class pattern23 {
    public static void main(String[] args) {
        int num=10;
        for(int i=15; i>=10; i--){
            for(int j=10; j<=i; j++){
                System.out.print(num++ + "    ");
            }
            System.out.println("  ");
        }
    }
}
// 10 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24
// 25 26 27
// 28 29
// 30