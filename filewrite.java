import java.io.FileWriter;
import java.io.File;
public class filewrite {
    public static void main(String[] args) {
        try{
            File a=new File("examplefile.txt");
            FileWriter ab=new FileWriter(a);
            ab.write("Hello Kumaran");
            ab.close();
        }
        catch(Exception E){
            System.out.println(E.getMessage());
        }
    }
}
