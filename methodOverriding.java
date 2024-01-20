public class methodOverriding {
    int legs=4;
    public void eats(){
        System.out.println("Animal can eat");
    }
    public void sleep(){
        System.out.println("Animal can sleep");
    }
}
class Dogs extends methodOverriding{
    int legs = 2; //Method Overriding from the value of parent/base class.
    public void eats(){
        System.out.println("Dogs can eat");
    }
}
class ans{
    public static void main(String[] args) {
        Dogs nete =  new Dogs();
        System.out.println(nete.legs); //It takes the legs value from sub/child class
        nete.eats();
        nete.sleep();
    }
}
