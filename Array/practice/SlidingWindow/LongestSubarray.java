package practice.SlidingWindow;

//Longest subarray with sum K
public class LongestSubarray {
    public static int longSubary(int[] arr, int k){
        //[2,1,1,3,2]     k=5
        int i=0,j=0,maxSize=0;
        long sum=0;
        while(j<arr.length){
            sum += arr[j];

            if(sum < k){
                j++;
            }

            while(sum > k && i<=j){
                sum -= arr[i];
                i++;
            }
            if(sum == k) {
                maxSize = Math.max(maxSize, j - i + 1);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,1,3,2};
        System.out.println(longSubary(arr, 5));
    }
}
