public class strstr {
    public static void main(String[] args) {
        
    int l=0,index=-1 , flag=0;
    String x =  "ccdeecbdfedcbabfdfaebdaf";
    String  y = "fecfacbccfe" ;
    for(int i = 0;i<x.length()-y.length()+1;i++){
        l=i;
        if(x.charAt(i)==y.charAt(0)){
            for(int j=0;j<y.length();j++){
                if(x.charAt(l)== y.charAt(j)){
                    l++;
                    flag = 1;
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                index = i;
                System.out.println(index);
            }
        }

    }
    System.out.println(index);
}
}
