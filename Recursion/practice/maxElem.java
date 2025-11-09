package practice;

public class maxElem {
    public static int getMax(int[] arr, int i, int max){
        if(i == arr.length){
            return max;
        }

        if(arr[i] > max){
            return getMax(arr, i+1, arr[i]);
        }
        return getMax(arr, i+1, max);

    }

    public static void main(String[] args) {
        int arr[] = {4, 7, 21, 3};
        System.out.println(getMax(arr, 0, arr[0]));
    }

}
