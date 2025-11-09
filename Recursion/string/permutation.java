package string;

public class permutation {
    public static void getperm(String str, String resultStr){
        if(str.isEmpty()){
            System.out.println(resultStr);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);

            String newStr = str.substring(0,i) + str.substring(i+1);
            getperm(newStr, resultStr + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        getperm(str, "");
    }
}
