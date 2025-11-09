public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,4,8,12};
        System.out.println("It is found at index "+search(arr, 0, 8));
    }

    public static int search(int[] arr, int i, int tar){
        if(i >= arr.length){
            return -1;
        }
        
        if(arr[i] == tar){
            return i;
        }
        return search(arr, i+1, tar);
    }
}
