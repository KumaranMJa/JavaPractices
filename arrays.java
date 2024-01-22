import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        int[][] arr=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=no.nextInt();
            }
        }
    }
}
