import java.util.ArrayList;
import java.util.Dictionary;
public class wordSearchProblem {
    // mujhe ek grid given hai character...
    // aur mujhe naa ek array given hai
    // meko constantly search krte rehna hai ki
    // kya us grid meh mere word present hai yaa nhi hai.

    public static boolean exist(String word , char[][] board){
        for(int i =0; i<board.length; i++){
            for(int j =0; j<board[0].length; j++){
                if(search(word , board , i , j , 0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean search(String word , char [][] board , int i , int j , int index){
        int row =  board.length;
        int col = board[0].length;
        if(i<0 || i>=row || j<0 || j>=col){
            return false;
        }
         
        if(index==word.length()){
            return true;
        }
        if(index>=word.length()){
            return false;
        }
        if(word.charAt(index)!=board[i][j]){
            return false;
        }
        // ek ek kar keh har ek cell ko check kare 
        // rahe honge hum ki kya character same aah rahe ni aah rahe.
         char ch  = board[i][j];
         
         // inorder to indicate weather ki humne kya yeh current character 
         // use kr liya keh nhiii...
         board[i][j]='#';

        int dx[] = {-1,0,+1,-1,+1,-1,0,+1};
        int dy[] = {+1,+1,+1,0,0,-1,-1,-1};
        // iterating in 8 different directions.
        for(int k =0; k<8; k++){
            if(search(word, board, i+dx[k], j+dy[k], index+1)){
                board[i][j] = ch;
                return true;
            }
        }
        // this is where backtracking takes places.
        board[i][j] = ch;
        return false;
    }
    public static String [] wordboogleProblem(String [] arr , char [][] board){
        ArrayList<String> ans = new ArrayList<>();
         for(int  i =0; i<arr.length; i++){
        
                if(exist(arr[i], board)){
                    ans.add(arr[i]);
                }
            
         }
         String [] str = ans.toArray(new String[0]);
         return str;
    }
}
