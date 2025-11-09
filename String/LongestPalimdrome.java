public class LongestPalimdrome {
    public static String longPalimSubstr(String s){
        String longest ="";

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                //check for palimdrome
                int left = i, right = j;
                boolean isPalim = true;
                while(left < right){
                    if(s.charAt(left)!=s.charAt(right)){
                        isPalim = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(isPalim){
                    String sub = s.substring(i, j+1);
                    if (sub.length() > longest.length()) longest = sub;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String s = "himadammom";
        String longest = longPalimSubstr(s);
        System.out.println(longest);
    }
}
