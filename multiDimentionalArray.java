public class multiDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        arr[0][0]=1;
        arr[1][1]=2;
        arr[2][2]=3;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
