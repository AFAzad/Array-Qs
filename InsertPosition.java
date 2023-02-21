public class InsertPosition {
    
        public static int searchInsert(int[] nums, int target) {
          int si = 0;
          int ei = nums.length-1;
          while(si <= ei){
              int mid = si +(ei-si)/2;
              if(nums[mid] == target){
                  return mid;
              }else if(nums[mid] > target){
                  ei = mid - 1;
              }else{
                  si = mid + 1;
              }
          }  
          return si;
        }
        public static void main(String args[]){
            int[] arr = {10, 12, 16, 18, 22};
            int target= 15;
            int ans = searchInsert(arr, target);
            System.out.println("The element will insert at index  : "+ans);
        }
    }

