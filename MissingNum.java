public class MissingNum {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = (n * (n + 1) / 2);
        int m = 0;
        for (int num : nums) {
            m += num;
        }
        return ans - m;
    }

    public static void main(String[] args){
        int[] arr= {9,6,4,2,3,5,7,0,1};
        int ans = missingNumber(arr);
        System.out.println("The missing num is: " +ans);
    }

}
