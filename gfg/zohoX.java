public class zohoX {
    public static void main(String[] args) {
        String S = "geeks";
        char[] arr = S.toCharArray();
        for(int x=0;x<arr.length;x++){
            for(int j=0;j<arr.length;j++)
            {
                if(j==x)
                {
                    System.out.print(S.charAt(x));
                }
                else if(j==arr.length-1-x)
                {
                    System.out.print(S.charAt(arr.length-1-x));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
