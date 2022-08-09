public class countPathsToReachFromSourceToDestination{
    // today we are solving some basic maze problems.
    
    public static int countWays(int rows , int columns){
        if(rows==1 || columns==1){
            return 1;
        }
        int left = countWays(rows-1, columns);
        int right  = countWays(rows, columns-1);
       return left+right;
    }
    public static void printPaths(String processed , int rows , int columns)
    {
        if(rows==1 && columns==1){
            System.out.println(processed);
            return;
        }
        if(rows>1){
            printPaths(processed+'D' , rows-1 , columns);
        }
        if(columns>1)
        {
            printPaths(processed+'R',rows , columns-1);
        }
    }
    
    
    public static void main(String[] args) {
        
    }
}