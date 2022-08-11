import java.util.ArrayList;
public class ratInAMazeProblem {
    public static  ArrayList<String> possiblePaths(int[][] grid , int n){
    
    ArrayList<String> ans = new ArrayList<>();
      helper(0 , 0 , n, grid,ans,"");

    return ans;
    
    }

    public static void helper(int i , int j , int n , int[][] grid , ArrayList<String> ans ,  String processed){
        // base case
        if(i<0 || j<0 || i>=n || j>=n || grid[i][j]==0) return;

        if(i==n-1 || j==n-1){
               ans.add(new String(processed)+"");
               return;
        }
        grid[i][j] = 0;
        helper(i-1, j, n, grid, ans, processed+"U");
        helper(i+1, j, n, grid, ans, processed+"D");
        helper(i, j-1, n, grid, ans, processed+"L");
        helper(i, j+1, n, grid, ans, processed+"R");
          grid[i][j] = 1;
          //return;
     }
    


}
