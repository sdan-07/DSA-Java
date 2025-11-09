public class QuickSort {
    public static int partition(int arr[], int l, int h){
        int piv = arr[l];
        int i = l - 1, j = h + 1;
        
        while(true){
            do{
                i++;
            }while(arr[i] < piv);

            do{
                j--;
            }while(arr[j] > piv);

            if(i >= j){
                return j;
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
    }

    public static void quickSort(int arr[], int l, int h){
        if(l < h){
            int j = partition(arr, l, h);
            quickSort(arr, l, j);
            quickSort(arr, j+1, h);
        }
    }
    public static void main(String[] args) {
        int arr[] = {80, 20, 50, 10, 60};
        quickSort(arr, 0, arr.length-1);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
