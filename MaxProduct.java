public class MaxProduct {
    public static int maxProductSubarray(int[] a) {
        int max = a[0]; 
        int min = a[0];
        int maxPdt = a[0];
     
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int tempMax = Math.max(curr, Math.max(max * curr, min * curr));
            min = Math.min(curr, Math.min(max * curr, min* curr));
            max = tempMax;
     
            maxPdt = Math.max(maxPdt, max);
        }
        return maxPdt;
    }
     
    public static void main(String[] args){
        int arr[] = {4, -6, 4, -2, -6, 8, -5};
        int ans = maxProductSubarray(arr);
        System.out.println("max product sub-array is  : "+ans+" ");
    }
}
