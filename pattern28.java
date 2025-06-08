public class pattern28 {
    public static void main(String[] args) {
        int n=9;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                if(k==1||i==n){
               System.out.print(i);
                }
               else{
                System.out.print(" ");
            }
        }
            for(int l=2; l<=i;l++){
                if(l==i||i==n ){
               System.out.print(i);
                }
               else{
                System.out.print(" ");
               }     
            }
            System.out.println( );
        }
    }
}
