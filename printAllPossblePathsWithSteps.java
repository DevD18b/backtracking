import java.rmi.StubNotFoundException;
import java.util.Arrays;

public class printAllPossiblePathsWithSteps{
    public static void main(String[] args) {
        
    }
    public static void helper(String processed , int rows , int columns , int[][] paths , boolean [][] grid , int steps ){

        // base condition.

     if(rows==grid.length-1 && columns== grid[0].length-1){
          for(int [] arr : paths){
             System.out.println(Arrays.toString(arr));
          }
          System.out.println(steps);
          return;
     }

     if(!grid[rows][columns]){
        return;
     }

     grid[rows][columns] = false;
     paths[rows][columns] = steps;

     if(rows>0){
        helper(processed+'U', rows-1, columns, paths, grid, steps+1);
     }
     if(rows<grid.length-1){
        helper(processed+'D', rows+1, columns, paths, grid, steps+1);
     }
     if(columns>0){
        helper(processed+'L', rows, columns-1, paths, grid, steps+1);
     }
     if(columns<grid[0].length){
        helper(processed+'R', rows, columns+1, paths, grid, steps+1);
     }

     grid[rows][columns] = false;
     paths[rows][columns] = 0;






    }
}