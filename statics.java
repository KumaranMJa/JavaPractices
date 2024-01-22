class Father{
    char gender = 'M'; 
    static int age = 50;//static allocates same memory for the variable when it changed anywere it changes all the side.
    static void disp1(){//static keyword can be used to access without creating object
        System.out.println("Father class");
    }
}
class Daughter extends Father{
    char gender = 'F';
}
public class statics {
    public static void main(String[] args) {
        Daughter n=new Daughter();
        System.out.println(n.gender);
        Father.disp1();
        System.out.println(Father.age);
        Daughter.age =20 ;
        System.out.println(Father.age);
    }
}
/*
 * OUTPUT : 
 * F
 * Father class
 * 50
 * 20
 */
//Static saves memory 
