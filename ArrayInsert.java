import java.util.*;
public class ArrayInsert {
    public static void main(String[] args) 
    {
        int length, pos,element;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        length = sc.nextInt();
        int arr[] = new int[length+1];
        System.out.println("Enter "+length+" all the elements:");
        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert an element:");
        pos = sc.nextInt();
        System.out.print("Enter the element which you want to insert:");
        element = sc.nextInt();
        for(int i = length-1; i >= (pos-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = element;
        System.out.print("After inserting : ");
        for(int i = 0; i <=length; i++)
        {
            System.out.print(arr[i]+" ");
        }
       
    }
}