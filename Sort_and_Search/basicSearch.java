import java.util.Scanner;
import java.util.Arrays;
public class basicSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter the element "+i+":");
            arr[i] = sc.nextInt();
        }

        //sort
        Arrays.sort(arr);
        System.out.println("After sorting: ");
        for(int val : arr) {
            System.out.print(val + " ");
        }

        //search
        System.out.println("Enter element to search:");
        int tar = sc.nextInt();
        System.out.println("Item found at index "+search(0, arr.length-1, arr, tar));
    }
    public static int search(int st, int end, int[] arr, int tar){
        int mid = st + (end - st) / 2;

        if(arr[mid] == tar){
            return mid;
        }else if(st > end){
            return -1;
        }

        if(arr[mid] < tar){
            return search(mid+1, end, arr, tar);
        }
        return search(st, mid, arr, tar);
    }
}