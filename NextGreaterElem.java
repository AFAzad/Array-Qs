public class NextGreaterElem {
    static void printNext(int arr[], int n) {
        int nextElem, i, j;
        for (i = 0; i < n; i++) {
            nextElem = -1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    nextElem = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "  " + nextElem);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 7, 16, 21, 5 };
        int n = arr.length;
        printNext(arr, n);
    }
}