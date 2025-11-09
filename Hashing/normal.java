import java.util.Arrays;

public class normal {
    public static void main(String[] args) {
        String[] st = {"cat","tops","stop","atc","hat","spot"};
//        Arrays.sort(st);
//        for(String s : st){
//            System.out.println(s);
//        }
        for (String s:st){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            System.out.println(s);
        }

    }
}
