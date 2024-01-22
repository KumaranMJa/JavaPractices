public class countingSort {
    public static void main(String[] args) {
        String arr="geeksforgeeks";
        int [] count = new int[26];
        for(int i=0;i<26;i++){
            count[i]=0;
        }
        for(int i=0;i<arr.length();i++){
            int temp=(int)(arr.charAt(i)-97);
            count[temp]++;
        }
        String ans="";
        for(int i=0;i<26;i++){
            for(int j=0;j<count[i];j++){
                 ans+=(char)(i+97);
                
            }
        }
        System.out.println(ans);;
    }
}
