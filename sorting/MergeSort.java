import java.util.List;
import java.util.ArrayList;

public class MergeSort {
    public static void sort(int[] nums, int st, int end){
        //Base Case
        if(st >= end) return;

         int mid = (st+end)/2;

    }

    public static int[] merge(int[] left, int[] right){
        List<Integer> lst = new ArrayList<>();
        int p1 = 0, p2 = 0;
        int[] answer = new int[nums.length];

        while(p1 < nums.length){
            if(left[p1] > right[p2]) lst.add(right[p2]);
            else lst.add(left[p1]);
            p1++;
            p2++;
        }
        for (int i = 0; i < lst.size(); i++) {
            answer[i] = lst.get(i);
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] nums = {20,10,50,30,40};
        int st=0, end = nums.length-1;
        int[] solution = sort(nums, st, end);
        for(int v : solution)
            System.out.print(v + " ");
    }
}
