interface Character{
    void attack();
}
interface Weapon{
    void use();
}
class Warrior implements Character,Weapon{
    public void attack(){
    System.out.println("warrior attacks withna sword");
}
public void use(){
    System.out.println("warrior uses a sword");
}
}
class Mage implements Character,Weapon{
public void attack(){
    System.out.println("Mage attacks with a wand");
}
public void use(){
    System.out.println("mage uses a wand");
}
}
 class MultipleInheritance{
public static void main(String[] args) {
Warrior w = new Warrior();
Mage m = new Mage();
w.attack();
w.use();
m.attack();
m.use();
}
}
