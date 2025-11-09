public class CheckSort {
    public static boolean isSort(int[] arr){
        return helper(arr, 0);
    }

    public static boolean helper(int[] arr, int i){
        if(i == arr.length -1){
            return true;
        }
        
        if(arr[i] > arr[i+1]){
            return false;
        }
        return helper(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,8,12};
        int arr2[] = {14,2,45,8,12};
        if(isSort(arr2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }    
}
