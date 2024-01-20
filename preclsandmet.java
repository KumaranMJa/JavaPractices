public class preclsandmet {
    public static void main(String[] args) {
        String s=Integer.toString(55);
        String x=Integer.toBinaryString(15);
        int a = Integer.parseInt(x);
        System.out.println(s+" "+x+" "+a);
        String str = "kumaran";
        System.out.println(str.charAt(3));
        char[] arr= str.toCharArray();
        for(char i : arr){
            System.out.println(i);
        }
        String st="2.9999";
        Double d= Double.parseDouble(st);
        System.out.println(d);
    }
}
