import java.util.ArrayList;

public class combinationSum1{

// we are given an integer array.
// we are given target...
// we need to return the total ways in which 
// we can make this sum equals to target.
static ArrayList<ArrayList<Integer>> ans =  new ArrayList<>();
static ArrayList<Integer> list = new ArrayList<>();
// any combination of number is allowed.
    public static ArrayList<ArrayList<Integer>> calculate(int [] arr , int target){

        helper(0, target, arr);
        return ans;
    }

   public static void helper(int index , int target, int [] arr){

   // base case
   if(index==arr.length)
   {
     if(target==0){
        ans.add(new ArrayList<>(list));
     }
     return;
   }

   if(arr[index]<=target){
    list.add(arr[index]);
    helper(index, target-arr[index], arr);
    list.remove(list.size()-1);
   }

   helper(index+1, target, arr);




   }



}