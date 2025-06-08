public class pattern17 {
    public static void main(String[] args) {
        for(int i=1; i<=13; i++){
            for(int j=1; j<=13; j++){
if(i==13||j==13||i==1||j==1){
    System.out.print(" 7");
}
else if(i==2||j==2||i==12||j==12){
    System.out.print(" 6");
}
else if(i==3||j==3||i==11||j==11){
    System.out.print(" 5");
}
else if(i==4||j==4||i==10||j==10){
    System.out.print(" 4");
}
else if(i==5||j==5||i==9||j==9){
    System.out.print(" 3");
}
else if(i==6||j==6||i==8||j==8){
    System.out.print(" 2");
}
else if(i==7||j==7){
    System.out.print(" 1");
            }
            }
            System.err.println("   ");
        }
    }
}
// 7 7 7 7 7 7 7 7 7 7 7 7 7
// 7 6 6 6 6 6 6 6 6 6 6 6 7
// 7 6 5 5 5 5 5 5 5 5 5 6 7
// 7 6 5 4 4 4 4 4 4 4 5 6 7
// 7 6 5 4 3 3 3 3 3 4 5 6 7
// 7 6 5 4 3 2 2 2 3 4 5 6 7
// 7 6 5 4 3 2 1 2 3 4 5 6 7
// 7 6 5 4 3 2 2 2 3 4 5 6 7
// 7 6 5 4 3 3 3 3 3 4 5 6 7
// 7 6 5 4 4 4 4 4 4 4 5 6 7
// 7 6 5 5 5 5 5 5 5 5 5 6 7
// 7 6 6 6 6 6 6 6 6 6 6 6 7
// 7 7 7 7 7 7 7 7 7 7 7 7 7