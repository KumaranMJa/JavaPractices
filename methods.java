public class methods {
    public static void main(String[] args) {
        System.out.println(add(10,7));
        multiply(); // - method calling
    }
    //functions inside class is methods, in Java functions refers to methods
    public static float add (int a,int b){ // return type - float , method namae - add , parameters - int a , int b
        float c = (float)a + b; // method definition
        return c;
    }
    public static void multiply(){
        int a=10,b=5;
        int c= a*b;
        System.out.println(c);
    }
}
