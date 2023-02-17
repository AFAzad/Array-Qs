public class PeakElement {

    public static int peakElem(int[]arr, int n){
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = high-(low+high)/2;
            if((mid == 0 || arr[mid] >= arr[mid-1]) && 
            (mid == n-1 || arr[mid] >= arr[mid+1])){
                return mid;
            }else if(arr[mid] <= arr[mid+1]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
       
    }
}
