public class accessSpecifier {
    private String name; //private field can be access only within its class
    int rollno;
    public void disp(){
        System.out.println(rollno);
    }
    public String getValue(){ //getter method to access the private field for outside class
        return name;  
    }
    public void setValue(String word, int num){ // setter field is to access the fields from outside the class
        name=word;
        rollno=num;
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
    class Solution{
        public static void main(String[] args) {
            accessSpecifier me = new accessSpecifier();
            me.setValue("Kumaran", 314);
            me.disp();
            String a= me.getValue();
            System.out.println(a);
            me.callFunc();
    }
}
