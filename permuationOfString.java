import java.util.ArrayList;
import java.util.HashSet;
public class permuationOfString {
    public static ArrayList<String> findAllPermutation(String str){
         char [] arr = str.toCharArray();
           ArrayList<String> ans = new ArrayList<>();
         permutation(arr, 0, arr.length, ans);
return ans;
    }
    public static void permutation(char [] arr , int index , int n, ArrayList<String> ans){
        if(index == n){
            ans.add(String.valueOf(arr));
            return;
        }
        HashSet<Character> set=  new HashSet<>();
                for(int i = index;i<n; i++){
                    char ch = arr[i];
                    if(set.contains(ch)){
                        continue;
                    }
                    else{
                        set.add(ch);
                    }
                   swap(arr , index, i);
                   permutation(arr, index+1, n, ans);
                   swap(arr, index, i);




                }
    }
    
    public static void swap(char [] arr , int low , int high){
        char temp =  arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
     
    }



    
}
