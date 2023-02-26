import java.util.HashSet;

public class BadArray {
    public static boolean isBad(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        boolean isBadArray = isBad(arr);
        System.out.println(isBadArray);  // prints "true"
        
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean isBadArray2 = isBad(arr2);
        System.out.println(isBadArray2);  // prints "false"
    }
}
