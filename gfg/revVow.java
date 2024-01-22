public class revVow {
    public static void main(String[] args) {
        String s = "aekppsiol";
        char[] ans=s.toCharArray();
        int start=0;
        int end= ans.length-1;
        while(start<end){
            if(!(ans[start]=='a'||ans[start]=='e'||ans[start]=='i'||ans[start]=='o'||ans[start]=='u')){
                start++;
                continue;
            }
            if(!(ans[end]=='a'||ans[end]=='e'||ans[end]=='i'||ans[end]=='o'||ans[end]=='u')){
                end--;
                continue;
            }
        char temp ;
        temp= ans[start];
        temp=ans[start];
        ans[start]=ans[end];
        ans[end]=temp;
        start++;
        end--;
    }
    String str= new String(ans);
    System.out.println(str);
    }
}
