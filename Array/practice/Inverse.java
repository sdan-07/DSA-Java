package practice;

public class Inverse {
    public static void getinverse(int[] arr){
        int[] newArr = new int[arr.length];
        int v;
        for(int i=0; i<arr.length; i++){
            v = arr[i];
            newArr[v] = i;
        }

        for(Integer val : newArr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,0,2,1};
        getinverse(arr);
    }
}
