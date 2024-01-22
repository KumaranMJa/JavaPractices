public class fstkeyword {
       public static void main(String[] args) {
        Chill n1= new Chill();
        System.out.println(n1.gen);
        n1.prin();
        Daught n2=new Daught();
        n2.pri1();
        fin1 n3=new fin1();
        n3.pri2(40,'F');
        System.out.println(n3.ag);
        System.out.println(n3.ge);
        fin2 n4=new fin2();
        System.out.println(n4.ge);
       }
        
}
class Parent{
    final char gen='M'; //cannot change the value of this instance
    final void prin(){ //cannot override this method
        System.out.println("Cant override this final method");
    }
}
class Chill extends Parent{
    char gen='F';
}
class Fat{
    char gender='M';
}
class Daught extends Fat{
    char gender ='F';
    void pri1(){
        System.out.println(super.gender); //access the value of parent class
    }
}
class fin1 {
    int ag;
    char ge;
    void pri2(int ag,char ge){
        this.ag=ag; //this keyword refers to the value of this class instances or variables where it store the values
        this.ge=ge;
    }
}
class fin2 extends fin1{
    char ge;
}
