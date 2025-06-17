import java.io.FileOutputStream;  
public class outputstream1 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("c:\Users\ashwa\OneDrive\Desktop\Anjali singh.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  