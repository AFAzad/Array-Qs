public class MinElement {
    public static int minElem(int arr[], int n){
        int min = arr[0];
        for(int i=0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
   public static void main(String args[]){
    int a[] = {15, 16, 21, 11, 14, 13};
    int n = a.length;
    System.out.println(minElem(a, n)+ " Min element in this array");
   } 
}
