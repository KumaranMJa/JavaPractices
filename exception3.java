class UserDefined extends Exception{ //user defined exception class and it should extends the Exxception class always
    UserDefined(String str){
        super(str); //message in this string stored in the parent class by super keyword and will be displayed 
    }
}
public class exception3 {
    static void summa(int age) throws UserDefined { //throws keyword should be used when the user defined class is created , we can give one or more user defined exception class by ","
        if(age < 18){
            throw new ArithmeticException("Invalid age"); 
        }
        else{
            throw new UserDefined("Valid Age");
        }
    }
    public static void main(String[] args) {
        try{
            summa(20);
        }
        catch (ArithmeticException A){ 
            System.out.println(A.getMessage()); 
        }
        catch(UserDefined A){
            System.out.println(A.getMessage());
        }
        System.out.println("HEllo World!");

    }
}
