package practice.SlidingWindow;

import java.util.Arrays;

public class DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {

        int i = 0, j = 1, sum = 0;
        if (k == 0) {
            Arrays.fill(code, 0);
        }
        while (j <= code.length - 1) {
            sum += code[j];

            if (j - i < k) j++;
            else if (j - i == k) {
                code[i] = sum;
                //shift
                j++;
                i++;
                sum -= code[i];

            }
        }
        return code;

    }

    public static void main(String[] args) {
        int[] code = {1, 4, 5, 6, 2};
        for (int v : decrypt(code, 0)) {
            System.out.println(v);
        }
    }
}
