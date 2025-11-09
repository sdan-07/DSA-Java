public class SumOfDigits {
    public static void main(String[] args){
        System.out.println("::Sum of digits::");
        System.out.println(sum(243));
    }

    public static int sum(int n){
        if(n == 0){
            return n;
        }
        return n%10 + sum(n/10);
    }
}