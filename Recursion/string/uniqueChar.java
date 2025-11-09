public class uniqueChar {
    public static void main(String[] args) {
        String str = "abbcddacb";
        System.out.println("The string is " + findUnique(str));
    }

    public static String findUnique(String str) {
        return helper(str, 0, "");
    }

    public static String helper(String str, int i, String newStr) {
        if(i == str.length()){
            return newStr;
        }

        String ch = "" + str.charAt(i);
        if(newStr.contains(ch)){
            return helper(str, i+1, newStr);
        }
        return helper(str, i+1, newStr + ch);

    }
}