public class NoOfSteps {
    //Count the number of steps to reduce a number to zero
    public static void main(String[] args) {
        System.out.println(reduce(14));
    }
    public static int reduce(int n){
        return helper(n, 0);
    }
    public static int helper(int n, int s){
        if(n == 0){
            return s;
        }
        
        if(n % 2 == 0){
            return helper(n / 2, s + 1);
        }
        return helper(n - 1, s + 1);
    }
}
