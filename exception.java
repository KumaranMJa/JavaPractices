public class exception {
    public static void main(String[] args) {
        int a=10,b=0;
        try{ //throws the exception to catch block instead of compiler
            System.out.println(a/b); //Exception block
        }
        catch(ArithmeticException A){ //catches the exception block and type of exception and create object for the exception class
            System.out.println("Print 0");
        }
        System.out.println("Hello World!");
    }
}
