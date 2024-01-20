public class objects {
    String name; 
    int rollno; //fields
    public static void main(String[] args) { 
        objects me = new objects(); // Syntax to cretae objects - class name object name =  new  constructor
        me.name="kumaran";
        me.rollno=314;
        objects frnd = new objects();
        frnd.name="Guru";
        frnd.rollno=90;
        frnd.display();
        me.display();
    }
    public void display(){ //method
        System.out.println(name);
        System.out.println(rollno);
    }
}
