 class Colour {
    int rollno;
    String name;
    static String college ="ITS";
   static void change(){
  college = "BBDIT";
    }
    Colour(int r,String n){
 rollno = r;
 name = n;
 System.out.println(rollno + " " + name +" " +college);
   }
  }
class static2 {
    public static void main(String[] args) {
      Colour.change();
      Colour obj = new Colour(100,"karan");
      Colour obj2 = new Colour(200,"Aryan");

    }
}
