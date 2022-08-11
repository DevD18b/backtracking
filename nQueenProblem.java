import java.util.ArrayList;
public class nQueenProblem{


public static ArrayList<ArrayList<String>> driverFunction(int n){
char [][] board = new char[n][n];
ArrayList<ArrayList<String>> ans = new ArrayList<>();
solver(0, ans, board);
return ans;

}

public static void display(char [][] board , ArrayList<ArrayList<String>> ans){
String row = "";
ArrayList<String> list =  new ArrayList<>();

for(int i=0; i<board.length; i++){
    row =  "";
    for(int j=0; j<board[0].length; j++){
        if(board[i][j]=='Q'){
            row+='Q';
        }
        else{
            row += '.';
        }
    }
    list.add(row);
}
ans.add(list);  
}
public static void solver(int col , ArrayList<ArrayList<String>> ans , char [][]board){
    if(col==board.length){
        display(board, ans);
        return;
    }
    for(int row = 0; row<board.length; row++){
        if(isValid(board, row, col)){
               board[row][col] = 'Q';
               solver(col+1, ans, board);
               board[row][col]='.';
        }
    }
    
}

public static boolean isValid(char [][] grid , int row , int col){

// check horizontally.
for(int i =0; i<grid.length; i++){
    if(grid[row][i]=='Q'){
        return false;
    }
}
// check vertically.

for(int i =0; i<grid.length; i++){
    if(grid[i][col]=='Q'){
        return false;
    }
}
// upper right.
int r =row;
for(int c = col; r>=0  && c<grid.length; c++,r-- ){
    if(grid[r][c]=='Q'){
        return false;
    }
}
// upper left.
r = row;
for(int c = col; r>=0 && c>=0; r--,c--){
    if(grid[r][c]=='Q'){
        return false;
    }
}

// bottom left
 r  = row;
for(int c = col; c>=0 && r<grid.length; c--, row++){
    if(grid[r][c]=='Q'){
        return false;
    }
}
// bottom right.
for(int c = col; c<grid.length && r<grid.length; c++,r++){
    if(grid[r][c]=='Q'){
        return false;
    }
}
return true; 
}

    public static void main(String [] args){

    }
}