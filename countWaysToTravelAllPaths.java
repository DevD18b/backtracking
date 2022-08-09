public class countWaysToTravelAllPaths {
    public  static void driverSolution(String processed , int rows, int colmns , boolean [][] grid){
         

        if(rows==grid.length-1 && colmns==grid[0].length-1){
               System.out.println(processed);
               return;
        }
        if(!grid[rows][colmns]){
            return;
        }
       // int up =0; int  down = 0 ; int  right = 0 ; int left  = 0;
        if(rows>0){
           driverSolution(processed+'U',rows-1, colmns, grid);
        }
        if(rows<grid.length-1){
              driverSolution(processed+'D',rows+1, colmns, grid);
        }
        if(colmns>0){
             driverSolution( processed+'R' ,rows, colmns-1, grid);
        }
        if(colmns<grid[0].length-1){
            driverSolution(processed+'L' ,rows, colmns+1, grid);
        }

        // this is where backtracking takes place.
        grid[rows][colmns] = true;

    }
    
}
