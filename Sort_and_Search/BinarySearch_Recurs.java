import java.util.Arrays;

public class BinarySearch_Recurs {
    public static void main(String[] args) {
        System.out.println("::Binary Search Program::");
        int arr[] = {50, 80, 20, 60};
        Arrays.sort(arr);
        
        System.out.println("Found at index: "+search(arr, 60, 0, arr.length-1));
    }

    public static int search(int[] arr, int tar, int st, int end){
        int mid = st + (end - st) / 2;
        // base case
        if(st > end){
            return -1;
        }
        
        if(arr[mid] == tar){
            return mid;
        }

        if(arr[mid] > tar){
            return search(arr, tar, st, mid-1);
        }
        
        return search(arr, tar, mid+1, end);
        
    }
}