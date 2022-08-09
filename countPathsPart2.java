public class countPathsPart2{
// we are given 1 more catch and that is we can also travel diagonally.
public static int countPath(int rows , int columns){

if(rows ==1 || columns==1){
    return 1;
}

int left = countPath(rows-1, columns);
int right = countPath(rows, columns-1);
int diagonally = 0;
if(rows>1 && columns>1){
    diagonally = countPath(rows-1, columns-1);
}
return left + right + diagonally;

}



    public static void main(String[] args) {
        
    }
}