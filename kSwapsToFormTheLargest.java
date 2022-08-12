public class kSwapsToFormTheLargest {
    static String max;
 public static void helper(char [] arr , int k){
    if(k==0)
    return;
    
    for(int i =0; i<arr.length-1; i++){
        for(int j =i+1; j<arr.length; j++){
            if(arr[i]<arr[j]){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j]  = temp;
                if(String.valueOf(arr).compareTo(max)>0){
                    max = String.valueOf(arr);
                }
                helper(arr, k-1);
                // backtracking
                char temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
            }
        }
    }
 }   
 public static String driverFunction(String str, int k){
    max = str;
    helper(str.toCharArray(), k);
    return max;
 }
}
