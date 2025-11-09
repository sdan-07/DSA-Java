package Stack.using.Collection;

import java.util.ArrayDeque;
public class basic {
    public static void main(String[] args) {
        ArrayDeque <Integer> s = new ArrayDeque<>();
        s.push(78);
        s.push(102);
        s.push(96);

        for (Integer value : s) {
            System.out.println(value);
        }
    }
}
