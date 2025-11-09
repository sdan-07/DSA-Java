package practice;

public class sumOfTwoArrays {
    public static int[] sum(int[] arr1, int[] arr2){
        int[] newArr = new int[Math.max(arr1.length, arr2.length)];
        int i = 0, j = 0, k=0;

        while(i < arr1.length || j < arr2.length){
            newArr[k] = arr1[i] + arr2[j];
            i++;
            j++;
            k++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr={8, 5, 7, 4, 6};
        int[] arr2={1, 2, 3, 4, 5};
        int[] newArr = sum(arr, arr2);

        System.out.print("[");
        for(Integer val : newArr){
            System.out.print(val+" ");
        }
        System.out.println("]");
    }
}
