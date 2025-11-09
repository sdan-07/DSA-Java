import java.util.HashMap;
public class Checking_redundancy {
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static boolean isRedundant(int[] arr){
        //loading all frequencies as values and elements as key
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        //traversing thru map and check if values count>1
        for(int count : map.values()){
            if(count > 1){
                return true;
            }
        }
        return false;
    }

    private static void printFreq() {
        for (int val : map.keySet()){
            System.out.println("Element "+val+" is "+map.get(val)+" times");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 5, 6, 3};
        if(isRedundant(arr)){
            System.out.println("There are repeating numbers in this array");
        }else{
            System.out.println("All numbers are distinct in this array");
        }
        System.out.println("Printing frequencies...");
        printFreq();
    }
}
