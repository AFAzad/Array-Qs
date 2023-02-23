public class CountInversion {
    public static int merge(int arr[], int temp[], int start, int mid, int end){
        int i, j, k;
        int count = 0;

        i = start;
        j = mid;
        k = end;
        while((i<= mid-1) && (j <= end)){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                count = count+(mid-i);
            }
        }
        while(i <= mid-1)
        temp[k++] = arr[i++];
        while(j <= end)
        temp[k++] = arr[j++];
        for(i = start; i <= end; i++){
        }
        return count;

    }

    public static int mergeSort(int[] arr, int[] temp, int start, int end){
        int count =0;
        if( end > start){
        int mid = start + (end-start)/2;
        count += mergeSort(arr, temp, start, mid);
        count += mergeSort(arr, temp, mid+1, end);
        
        }
        return count;
    }


    public static void main(String[] args){
       
    }
}
