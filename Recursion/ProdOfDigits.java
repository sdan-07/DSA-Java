public class ProdOfDigits {
    public static void main(String[] args){
        System.out.println("::Product of digits::");
        System.out.println(prod(243));
    }

    public static int prod(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * prod(n/10);
    }
}
