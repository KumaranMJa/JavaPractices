public class polymorphism {
    public static void main(String[] args) {
    Test ne = new Test();
    System.out.println(ne.sum());
    System.out.println(ne.sum(7,7));
    }
} //polymorphism Method Overloading - same methods with different parameters
class Test{
    public int sum(){
        int a=10,b=20;
        int c=a+b;
        return c;
    }
    public int sum(int x,int y){
        int z= x*y;
        return z;
    }
}
