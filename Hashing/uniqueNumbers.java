import java.util.*;
public class uniqueNumbers {
    public static int[] UniqueNo(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int val:arr){
            set.add(val);
        }

        int i=0;
        int[] result = new int[set.size()];
        for(int val:set){
            result[i++] = val;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,4,4,5};
        for(int v: UniqueNo(nums)){
            System.out.print(v+" ");
        }
    }
}
