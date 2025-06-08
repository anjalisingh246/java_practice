 class D {
    int rollno ;
    String name;
    static String college = "tit";
   void a(int r,String n){
        rollno = r;
        name = n;
        System.out.println(rollno + " " + name + " " + college);
    }
   
   void b(int r,String n){
       rollno = r;
       name = n;
        System.out.println(rollno + " " + name + " " + college);
}
}
 class static1 {
 	public static void main(String[] args) {
		D e = new D();
		e.a(101,"ram");
		e.b(106,"shyam");
	}
}

