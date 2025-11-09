import java.util.Arrays;

public class BinarySearchNew {
    public static void main(String[] args) {
        System.out.println("::Binary Search Program::");
        int arr[] = {50, 80, 20, 60};
        Arrays.sort(arr);
        
        System.out.println("Found at index: "+search(arr, 60));
    }

    public static int search(int arr[], int tar){
        //without recursion
        int st = 0, end = arr.length - 1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] < tar){
                st = mid + 1;
            }
            else if(arr[mid] > tar){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}