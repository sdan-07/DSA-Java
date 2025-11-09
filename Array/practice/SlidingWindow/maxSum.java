package practice.SlidingWindow;
//Max sum subarray of sum K  (k = window size)
public class maxSum {
    public static int getMax(int[] arr, int k){
        int j = 0, i = 0, sum = 0, mx = 0;
        while(j < arr.length){
            sum += arr[j];
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                //calculation
                mx = Math.max(mx, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1};
        System.out.println(getMax(arr, 3));
    }
}
