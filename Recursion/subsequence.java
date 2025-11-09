public class subsequence {
    public static void main(String[] args) {
        String str = "xyz";
        subseq(str, 0, "");
    }

    public static void subseq(String str, int i, String newStr){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(i);
        subseq(str, i+1, newStr + ch);
        subseq(str, i+1, newStr);
    }
}
