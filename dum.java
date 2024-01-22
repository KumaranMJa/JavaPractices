class Template{
    void info(String name, int rn,int mk){
        int rollno = rn;
        int mark = mk;
        System.out.println(name+" "+rollno+" "+mark);
    }
}
public class dum {
    public static void main(String[] args) {
        Template saro = new Template();
        saro.info("saravanan",86,90);
        Template moha = new Template();
        moha.info("mohan",70,100);
    }
}
