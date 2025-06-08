
        class Vehicle{
            void run (){
                System.out.println("running");
            }
        }
        class Bike extends Vehicle {
void mileage(){
    System.out.println("100km");
}
        }
        public class singleinheritance {
    public static void main(String[] args) {
    Bike obj = new Bike();
    obj.run();
    obj.mileage();
}
  }