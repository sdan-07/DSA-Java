package practice.SlidingWindow;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegative {

    public static void firstNeg(int[] arr, int k){
        int i=0, j=0;
        Deque <Integer> list = new LinkedList<>();
        ArrayList <Integer> result = new ArrayList<>();

        while(j < arr.length){
            if(arr[j] < 0){
                list.add(arr[j]);
            }
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                if (list.isEmpty()){
                    result.add(0);
                }else{
                    result.add(list.getFirst());
                }
                //window shift
                if (arr[i] < 0){
                    list.remove(0);
                }
                i++;
                j++;
            }
        }

        //print
        System.out.print(result);
    }


    public static void main(String[] args) {
        int[] arr = {2, -6, 3, -4, -2, 4, 1, 8};
        firstNeg(arr, 3);
    }
}


