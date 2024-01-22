import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter a Double:");
        double x=sc.nextDouble();
        System.out.println("Enter a Float");
        float y=sc.nextFloat();
        System.out.println("Enter a String");
        Scanner sc1=new Scanner(System.in);
        String str=sc1.nextLine();
        System.out.println("Enter a Word");
        char a=sc.next().charAt(0);
        System.out.println(n+" "+x+" "+y+" "+str+" "+a);
    }
}
