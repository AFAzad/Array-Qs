import java.util.*;
public class SubArraySum {
    public static int subArrayOfSum(int[] arr,int x, int target){
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(map.containsKey(sum-target)){
                ans += map.get(sum-target);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);

        }
        return ans;
    }
   public static void main(String args[]){
    int[] arr = {10, 2, -2, -20, 10};
    int target = -10;
    int x = arr.length;
    
    System.out.println("The sum is : "+subArrayOfSum(arr, x, target));
   
    

   } 
}
