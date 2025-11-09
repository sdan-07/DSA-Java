public class FirstOccur {
    public static void firstoccur(String haystack, String needle){
        int i = 0, r=0, l=0;
        char firstLetter = needle.charAt(0);
        while(i<haystack.length()){
            if(haystack.charAt(i)==firstLetter){
                l = i;
                break;
            }else{
                i++;
            }
        }

        String haystackPart = haystack.substring(l, l+needle.length());

        if(haystackPart.equals(needle)){
            System.out.println("Contains");
        }else{
            System.out.println("Not contains");
        }
    }

    public static void main(String[] args) {
//        System.out.println(firstoccur("sadbutsad", "but"));
        firstoccur("sadbutsad", "saw");
    }
}
