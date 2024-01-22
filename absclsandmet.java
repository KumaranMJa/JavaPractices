abstract class class1{ //abstract class , it cannot create any objects
    abstract void turnoff(); //abstract method - it only can have method declration
    abstract void turnon();
}
class class2 extends class1{ //abstract class is inherited to access it
    void turnon(){ //method overriding for abstract method 
        System.out.println("Turning ON - 1");
    }
    void turnoff(){
        System.out.println("Turning Off - 2");
    }
}
class class3 extends class1{
    void turnon(){
        System.out.println("Turning ON - 3");
    }
    void turnoff(){
        System.out.println("Turning Off - 4");
    }
}
public class absclsandmet {
    public static void main(String[] args) {
        class2 ob1=new class2();
        ob1.turnon();
        ob1.turnoff();
        class3 ob2 = new class3();
        ob2.turnon();
        ob2.turnoff();
    }
}
