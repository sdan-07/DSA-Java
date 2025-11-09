package Array;

import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {14, 8, 9, 2, 6};
        Arrays.sort(arr);
        System.out.println("Found at index: "+search(arr, 6, 0, arr.length-1));
    }   
    
    public static int search(int[] arr, int tar, int start, int end){
        int m = start + (end - start) / 2;
        
        if(start > end){
            return -1;
        }else if(arr[m] == tar){
            return m;
        }

        if(arr[m] < tar){
            return search(arr, tar, m+1, end);
        }
        return search(arr, tar, start, m-1);

    }
}
