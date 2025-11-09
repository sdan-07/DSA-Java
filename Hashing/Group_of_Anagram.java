import java.util.*;

public class Group_of_Anagram {
    static List<List<String>> lst = new LinkedList<>();

    public static List<List<String>> getAnagram(String[] arrStr){
        //sort the array
        Arrays.sort(arrStr);
        //check if equal
        for(int i=0; i< arrStr.length; i++){
            for(int j=0; j< arrStr.length; j++){
                if (arrStr[i].equals(arrStr[j])){
                    List<String> pair = new LinkedList<>();
                    pair.add(arrStr[i]);
                    pair.add(arrStr[j]);

                    lst.add(pair);
                }
            }
        }

        return lst;
    }


    public static void main(String[] args) {
        String[] strs = {"cat","pots","stop","act","hat","tops"};
        List<List<String>> result = getAnagram(strs);
        System.out.println(result);
    }

}
