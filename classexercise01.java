abstract class person{
    String name;
    int age;
    abstract void displayDetails();
} 
interface Employee{
    abstract int calculateSalary();
}
class student extends person{
    public void displayDetails(){

    }
}
class admin extends person implements Employee{
    public void displayDetails(){

    }
    public int calculateSalary(){
        int salary=0;
        //variables and sum
        return salary;
    }
}
public class classexercise01 {
    public static void main(String[] args) {
        
    }
}
