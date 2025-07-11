package pattern;
public class pattern9 {
     public static void main(String args[]){
       for(int i = 0 ; i <= 4 ; i++){
for(int j = 0 ; j<= i ; j++){
    System.err.print("* ");
}
System.out.println("  ");
        }
        for(int k = 0 ; k <= 5 ; k++){
            for(int l = 5 ; l>= k ; l--){
                System.err.print("* ");
            }
            System.out.println("  ");
                    }
        
    }
}

// *
// * *
// * * *
// * * * * 
// * * * * *
// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *