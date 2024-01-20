public class exception2 {
    static void summa(int age){
        if(age < 18){
            throw new ArithmeticException("Invalid age"); //creating a manual exception 
        }
    }
    public static void main(String[] args) {
        try{
            summa(16);
        }
        catch (ArithmeticException A){ //ArithmeticException and having Object A
            System.out.println(A);
            System.out.println(A.getMessage()); //to get the message only
        }
        System.out.println("HEllo World!");

    }
}
