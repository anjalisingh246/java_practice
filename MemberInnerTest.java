public class MemberInnerTest {   
 void run(){        
 System.out.println("outer class method");     }  
 class Inner{       
 void display(){      
System.out.println("Innerclass method");    
  }   
  }  
 public static void main(String [] args){  
 MemberInnerTest o = new MemberInnerTest();       
 MemberInnerTest.Inner i = o.new Inner();       
 i.display();
 o.run();     
}    
  }

