public class constructors {
    int mark,rol;
    public void dis(){
        int s = mark*rol;
        System.out.println(s);
    }
    constructors(int x, int y){
        mark=x;
        rol=y;
        System.out.println(x);
        System.out.println(y);
    }

}
class samp{
    public static void main(String[] args) {
        constructors x = new constructors(100,314); //constructor with parameter. It is called implicitly when a object is created.
        x.dis();
    }
}
