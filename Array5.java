public class Array5 {
    public static void main(String[] args) {
        int [][]a ={ {10,20,10},{30,40,50},{10,50,67}};
        int [][]b = {{100,90,98},{80,7,670},{601,20,84}};
        if(a.length != b.length){
        System.out.println("Arrays are not of the same length");
        }
        int sumarray[][] = new int[a.length][b.length];
        for(int i = 0;i<a.length;i++)
         for(int j = 0;j<b.length;j++)
        sumarray[i][j] = a[i][j]+b[i][j];
        System.out.println("addition of matrix is");
        for(int i=0;i<sumarray.length;i++){
            for(int k=0;k<sumarray.length;k++) {
            System.out.print(sumarray[i][k]+" ");
        }
        System.out.println("  ");
        }
    }
}
