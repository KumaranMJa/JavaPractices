public class airthemeticOperation {
    public static void main(String[] args) {
        int a= 50 , b=75;
        float c = a/b; //Implicit typecasting
        System.out.println(String.format("%.2f",c));  // 0.0
        float d= (float) a/b; //Explicit typecasting
        System.out.println(String.format("%.2f",d)); // 0.6
    } 
}
