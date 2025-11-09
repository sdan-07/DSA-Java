public class RevNumb {
    public static void main(String[] args) {
        //if u want to take digits as argument
        System.out.println(rev(4512, 4));  
    }

    public static int rev(int n, int digit){
        int rem = n % 10;
        if(n%10 == n){
            return n;
        }
        return rem * (int)Math.pow(10, digit - 1) + rev(n/10, digit - 1);
    }
}
