interface Father{ //interrface class
    int age = 20;
    abstract void call(); //interrface only have abstract methods
}
interface Mother{
    abstract void talk();
}
//Multiple-Inheritence achieved through interface
class dummy implements Father,Mother{ //interfaa=ce can be inherited using implements keyword
    int age = 41;
    public void call(){ //interface abstract class overridden using public keyword
        System.out.println("Calling");
    }
    public void talk(){
        System.out.println("Talking");
    }
}
public class interfaces {
    public static void main(String[] args) {
        dummy d12=new dummy();
        d12.call();
        d12.talk();
        System.out.println(d12.age);
    }
}
 