package pattern;

public class pattern24 {
    public static void main(String[] args) {
        int n=9;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                    if( j==5||i==5||i==1||j==1||i==n||j==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                
            System.out.println( " ");
        }
    }
    
}