class grandMother{
    char gender='F';
    public void displ(){
        System.out.println("Ju-Lee Family");
    }
}
class Father extends grandMother{
    char gender='M';
}
class Son extends Father{

}
class daughter extends Father{
    char gender='F';
}
class child extends daughter {
    
}
public class typesOfInheritence {
   public static void main(String[] args) {
    Father neob=new Father();
    System.out.println(neob.gender);
    neob.displ();
    child nob = new child();
    System.out.println(nob.gender);
    nob.displ();
   } 
}

