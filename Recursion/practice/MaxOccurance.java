package practice;

public class MaxOccurance {
    public static int maxOccur(int[] arr){
        int maxCount = 0;
        int maxElem = arr[0];
        for(int i=0; i<arr.length; i++){
            int count = 0;

            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                maxElem = arr[i];
            }
        }
        return maxElem;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2, 4, 2, 3, 3};
        System.out.println(maxOccur(arr));
    }
}
