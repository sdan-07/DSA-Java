package practice;

public class RotateArray {
    public static void rotate(int[] arr, int key){
        key = key % arr.length;
        if(key < 0){
            key = key + arr.length;
        }
        //reverse part 1
        //[40,30,20,10, 50,60,70]
        reverse(arr, 0, arr.length-key-1);
        //part 2
        //[40,30,20,10, 70,60,50]
        reverse(arr, arr.length-key, arr.length-1);
        //whole reverse
        //[50,60,70,10,20,30,40]
        reverse(arr, 0, arr.length-1);

        //print the array
        System.out.print("[");
        for (Integer val : arr){
            System.out.print(val+" ");
        }
        System.out.println("]");
    }

    public static void reverse(int[] arr, int i, int j){
        int li = i;
        int ri = j;

        while(li < ri){
            //swap
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        rotate(arr, -2);
    }
}
