import java.util.*;

public class hash {
    public static void main(String[] args) {
        String s = "ababababab";
        String p = "aab";

        List<Integer> lst = new ArrayList<>();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        int sLen = s.length(), pLen = p.length();
        if (pLen > sLen) System.out.println(lst);
        char[] pArr = p.toCharArray();
        for (char c : pArr) {
            map1.put(c, map1.getOrDefault(c, 1) + 1);
        }

        int i = 0;
        while (i <= sLen - pLen) {
            String sub = s.substring(i, i + pLen);
            char[] subArr = sub.toCharArray();
            map2.clear();
            for (char c : subArr) {
                map2.put(c, map2.getOrDefault(c, 1) + 1);
            }
            if (map1.equals(map2)) lst.add(i);
            i++;

        }
        System.out.println(lst);

    }
}


