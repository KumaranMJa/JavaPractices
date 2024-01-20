public class creatingObjects {
    int mark1 , mark2;
    public void display(){
        System.out.println(mark1);
        System.out.println(mark2);
    }
    public void setValues( int m1, int m2){
        mark1=m1;
        mark2=m2;
    }
}
class Main{
    public static void main(String[] args) {
        creatingObjects me = new creatingObjects();
        me.setValues(90, 80);
        me.display();
        creatingObjects frnd = new creatingObjects();
        frnd.setValues(95,85);
        frnd.display();
    }
}

