package practice;

public class sumOfArray {
    public static int sum(int[] arr, int i, int sum){
        if(i == arr.length){
            return sum;
        }

        return sum(arr, i+1, sum + arr[i]);
    }

    public static void main(String[] args) {
        // print sum of elements of array
        int[] arr = {1, 2, 3, 4};
        System.out.println(sum(arr, 0, 0));
    }

}

