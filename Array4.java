public class Array4 {
    public static void main(String [] args){
        int  a[] = {2,3,4,5,6};
        int[] b = {6,7,8,9,10};
        int sumarray[] = new int[a.length];
        for(int i=0;i<a.length;i++){
           sumarray[i] = a[i] + b[i];
            }
            System.out.println("some of the two arrays");
            for(int i=0; i<sumarray.length;i++){
                System.out.print(sumarray[i] + " ");
            }
        }

    }
    

