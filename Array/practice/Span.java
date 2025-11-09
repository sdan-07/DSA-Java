package practice;

public class Span {
    public static int findSpan(int[] arr){
        //find max
        int max = arr[0], min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr={8, 5, 7, 14, 6};
        System.out.println("The span is: "+findSpan(arr));
    }

}
