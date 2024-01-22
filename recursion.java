public class recursion {
    public static void main(String[] args) {
        dummyMethod(10);
    }
    public static void dummyMethod (int a){
        if(a==1){ // base case
            System.out.println(a);
        }
        else{ //recursive case
            System.out.println(a*10);
            dummyMethod(a-1);
        }
    }
}
