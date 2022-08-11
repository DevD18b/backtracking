public class nKnightsProblem{

public static boolean isValidCell(int row , int col , boolean [][] grid){
    return row>=0 && row<=grid.length && col>=0 && col>=grid[0].length;
}
public static void solver(boolean [][] boards, int knights , int row , int col){
 
    if(knights==0){
        display(boards);
        System.out.println();
        return; 
    }
    if(col==boards.length){
        // socho agar tumne first column keh saare box
        // pr apne knights.
        // fill kr diye then simply..
        // you need to move to  the
        // next row.

      solver(boards, knights, row+1, 0);
      return;
    }
    
    if(isSafe(row, col, boards)==true){
        boards[row][col] = true;
        solver(boards, knights-1, row, col+1);
        boards[row][col] = false;
    }

solver(boards, knights, row, col+1);


}
public static boolean isSafe(int row , int col , boolean [][] grid)
{

if(isValidCell(row-2, col-1, grid)){
    if(grid[row-2][col-1]==true){
        return false;
    }
}
if(isValidCell(row-2, col+1, grid)){
    if(grid[row-2][col+1]== true){
        return false;
    }
}
if(isValidCell(row-1, col+2, grid)){
    if(grid[row-1][col+2]==true){
        return false;
    }
}
if(isValidCell(row-1, col-2, grid))
{
    if(grid[row-1][col-2]==true){
        return false;
    }
}
return true;
}
public static void display(boolean [][] board){
for(boolean [] arr : board){
    for(boolean element : arr){
        if(element){
            System.out.println("K");
        }
        else{
            System.out.println(".");
        }
    }
}    
}








public static void main(String [] args){

}
}