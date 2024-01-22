import java.util.Scanner;
import java.io.File;
public class fileread {
    public static void main(String[] args) {
        try{ 
        File f = new File("examplefile.txt");
        Scanner read = new Scanner(f);
        while(read.hasNextLine()){
            System.out.println(read.nextLine());
            }
        read.close();
        }
        catch(Exception A){
            System.out.println(A.getMessage());
        }
    }
}
