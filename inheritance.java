public class inheritance {
   int legs=4;
   public  void walk(){
        System.out.println("ANIMAL CAN EAT");
   } 
}
class Dog extends inheritance{//inheriting the above class - child class extends parent class
    public void bark(){
        System.out.println("Dog can Bark");
    }
}
class mai{
    public static void main(String[] args) {
        Dog ob = new Dog(); 
        System.out.println(ob.legs);
        ob.walk();
        ob.bark();
    }
}
