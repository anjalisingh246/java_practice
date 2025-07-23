import java.io.FileOutputStream ;  
public class IO {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout = new FileOutputStream("constructor.docx");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){
System.out.println(e);
}    
      }    
    }