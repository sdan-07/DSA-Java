public class prefixSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        //steps to make prefix array
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int v:prefix){
            System.out.print(v+" ");
        }
    }
}
