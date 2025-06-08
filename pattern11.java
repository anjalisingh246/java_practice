public class pattern11 {
    public static void main(String[] args) {
        int n=5;
        int m=n;
        for(int i = 1; i<= n; i++)
        {
            for(int j = 0 ; j<=m; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= i ; k++){
                System.out.print("* ");
            }
            m--;
            System.out.print("\n");
        }
        for(int l = 1; l<= n; l++)
        {
            for(int p = 7 ; p>=9; p--)
            {
                System.out.print("  ");
            }
            for (int  q= 1; q <= l ; q++){
                System.out.print("* ");
            }
            m--;
            System.out.print("\n");
        }
        
        
    }
    
}
