public class encAndAbs {  //encapsulation is encapsuling the related fields and methods under a same class
    private String name; //access modifiers used for abstraction(hiding data)
    int rollno;
    public void disp(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public String getVal(){
        return name;  
    }
    public void setVal(String word, int num){ 
        name=word;
        rollno = num;
    }
    private int a=10, b=20;
    private void di(){
        int c=a*b;
        System.out.println(c);
    }
    public void callFunc(){
        di();
    }
}
    class Solut{
        public static void main(String[] args) {
            encAndAbs me = new encAndAbs();
            me.setVal("Kumaran", 314);
            me.disp();
            String a= me.getVal();
            System.out.println(a);
            me.callFunc();
    }
}
