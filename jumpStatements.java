public class jumpStatements {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            for(int j=1;j<=3;j++){
                if(j==2){
                    continue;
                }
                System.out.println(i+" "+j);   
            }
        }
    }
}
