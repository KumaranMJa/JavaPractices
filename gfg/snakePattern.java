import java.util.*;
class snakePattern
{
    public static void main(String args[]) IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.snakePattern(matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        int len = matrix.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            if(i%2==0){
                for(int j=0;j<len;j++){
                    ans.add(matrix[i][j]);
                }
            }
            else{
                for(int j=len-1;j>=0;j++){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}